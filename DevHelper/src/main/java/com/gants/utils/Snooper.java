package com.gants.utils;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.json.JSONObject;
import org.json.XML;

public class Snooper {

	private ClassLoader cl = null;
	private JAXBContext jaxbContext = null; 
	
	
	/**
	 * This is a method that will take raw XML and turn it into JSON. This assumes you have an XML schema
	 * that has been UnMarshalled to Java at some point or that could be; and that you want to see it in
	 * a JSON form. Pass in the OjectFactory of said UnMarshalled schema, the package name and the class that
	 * represents the XML you want to see as JSON.
	 * 
	 * @param ObjectFactoryClazz - for example mil.navy.navair.cameo.v22.gsamedatamodel.flightdata.ObjectFactory
	 * 
	 * @param pkg - mil.navy.navair.cameo.v22.gsamedatamodel.flightdata
	 * 
	 * @param clazz - what your trying to marshall.
	 * @throws JAXBException 
	 * 	 * 
	 */
	
	public JSONObject marshallToJson(Class<?> ObjectFactoryClazz, String pkg, Class<?> clazz ) throws JAXBException  {
		
		cl = ObjectFactoryClazz.getClass().getClassLoader();
		jaxbContext = JAXBContext.newInstance(pkg, cl);
		Marshaller m = jaxbContext.createMarshaller();		
		StringWriter sw = new StringWriter();
		m.marshal(clazz, sw);			
		JSONObject json = XML.toJSONObject(sw.toString());	
		
		return json;		
	}
}
