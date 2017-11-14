package com.gants;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gants.config.MongoConfig;
import com.gants.model.Address;
import com.gants.model.Restaurant;
import com.gants.repository.RestaurantRepository;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class); 
		
		RestaurantRepository restaurantRepositoryImpl = context.getBean(RestaurantRepository.class);
	
	
		System.out.println(restaurantRepositoryImpl.count());
		List<Restaurant> r = restaurantRepositoryImpl.findAll();
		
		for(Restaurant rest : r) {
			if( rest.getName().equals("Subway") ){
				System.out.println("**************************************");
				System.out.println("Eat at " + rest.getName() + " in Burrogh " + rest.getBorough());
				System.out.println("Building " + rest.getAddress().getBuilding());
				System.out.println("Building " + rest.getAddress().getStreet());				
				System.out.println("**************************************");
			}
		}
	}

}
