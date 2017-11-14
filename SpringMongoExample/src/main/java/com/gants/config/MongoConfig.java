package com.gants.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories("com.gants.repository")
public class MongoConfig extends AbstractMongoConfiguration {
		
/*		@Override
		public MongoClient mongoClient() {
			return new MongoClient("127.0.0.1", 27017);
		}
*/
		@Override
		protected String getDatabaseName() {			
			return "test";
		}

		@Override
		protected String getMappingBasePackage() {
		    return "com.gants";
		}

		@Override
		public Mongo mongo() throws Exception {
			return new MongoClient("127.0.0.1", 27017);
			
		}
}
