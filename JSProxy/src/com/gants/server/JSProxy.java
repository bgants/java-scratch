package com.gants.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This will get you past the Same Origin Policy (SOP), very helpful during development.
 * see - https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy.
 * 
 * 
 * Works for GETs and POSTs.
 * 
 * Deployment: 
 * 		drop the war file into the same servlet container (i.e. Tomcat) that your running your 
 * 		javascript app from, this will proxy your request for you.* 		
 * 
 * Usage:   
 *  	/JSProxy/proxy?url=<URL>/<SERVICE>
 *  
 * Example :
 * 		In your javascript you would pre-pend the /JSProxy/proxy?url= to your RESTful call like so, * 	
 * 		/JSProxy/proxy?url=http://172.29.8.44:8080/MSAPI/datasets
 * 		/JSProxy/proxy?url=http://localhost:7777/AmeDataModel/FlightData.jsp?method=doQuery
 */

public class JSProxy extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String queryString = req.getQueryString();
		
		URL u = new URL(queryString.substring(4));
		
		System.out.println("Proxying: " + u.toString());		
		
		InputStream is = u.openStream();
		OutputStream os = resp.getOutputStream();
		
		byte[] buf = new byte[64 * 1024];
		int read = 0;
		while ( (read = is.read(buf))>0){
			os.write(buf, 0, read);			
		}
		
		os.close();
		is.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String queryString = req.getQueryString();
		String name  = req.getServerName();		
		
		URL u = new URL(queryString.substring(4));		
		System.out.println("Connecting from " + name + " and proxying to " + u.toString());	
		
		String connToHost = u.getHost();
		int connToPort = u.getPort();
		
		HttpURLConnection conn = (HttpURLConnection) u.openConnection();    
		
		System.out.println("Open connection to host " + connToHost + " on port  " + connToPort);
		
		conn.setDoOutput( true );		
		conn.setRequestProperty( "Content-Type", "application/xml" ); 
		conn.setRequestProperty( "charset", "utf-8" );		
		conn.setUseCaches( false );
		
		String requestBody = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		System.out.println(requestBody);
		
		OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
		
		writer.write(requestBody);
		writer.close();

		InputStream connInputStream = conn.getInputStream();		
		OutputStream os = resp.getOutputStream();
	
		byte[] buf = new byte[64 * 1024];
		int read = 0;
		while ( (read = connInputStream.read(buf))>0){
			os.write(buf, 0, read);			
		}
		
		os.close();
		connInputStream.close();
		
	}	
	
	
}
