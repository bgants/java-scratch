package com.gants;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.gants.model.Person;
import com.mongodb.MongoClient;

public class Application {
	/*
	 * 
	 */
	
	public static final String DB_NAME = "workers";
	public static final String PERSON_COLLECTION = "Person";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
	public static void main(String[] args) {
		
		
		System.out.println("Main");
/*		try { 
			
			MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
			MongoClient mongoClient = new MongoClient(connectionString);	
		 
			MongoDatabase db = mongoClient.getDatabase("test");
			System.out.println("Connect to database successfully");
			
			MongoCollection col = db.getCollection("restaurants");
			System.out.println ("There are :" + col.count() + " documents in this collection." );

			mongoClient.close();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		try {
			MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			Person p = new Person("Joe",format.parse("2017-10-17T12:55:32.470Z"));
			mongoOps.insert(p, PERSON_COLLECTION);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
