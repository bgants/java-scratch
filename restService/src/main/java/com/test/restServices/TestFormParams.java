package com.test.restServices;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//SOme POST examples

@Path("TestFormParams")
public class TestFormParams {
	@POST
	@Path("publish")
	@Produces(MediaType.TEXT_XML)
	public Object publish(@FormParam("message")String message,@QueryParam("topicName") String topicName)throws Exception{
		System.out.println("Message--> " + message);
		System.out.println("topicName--> " + topicName);
		return message;
	}
	
	@POST
	@Path("installRecordReceiveService")
	@Produces(MediaType.TEXT_XML)
	public Object installRecordReceiveService(String message) throws Exception{
		System.out.println("Message--> " + message);
		
		return "ok";
	}
	
	@POST
	@Path("simpleJsonService")
	@Produces(MediaType.APPLICATION_JSON)
	public Object simpleJsonService(String message) throws Exception{
		System.out.println("Message--> " + message);
		
		return "ok";
	}
	
}
