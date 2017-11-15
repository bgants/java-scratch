package com.gants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gants.model.Restaurant;
import com.gants.repository.RestaurantRepository;

@RestController
@RequestMapping(value="/home")
public class RestaurantController {
	
	@Autowired 
	private RestaurantRepository repo;
	

	@Autowired 
	private MongoTemplate mongTemplate;
	
	@RequestMapping(value="/restaurants", method = RequestMethod.GET)
	public List<Restaurant> restaurants() {
		List<Restaurant> r = repo.findAll();
	
		return r;
	}
	
	@RequestMapping(value="/restaurants/restaurantName", method = RequestMethod.GET)
	public List<Restaurant> grade(@RequestParam("name") String name) {
		if(name.equals("Wendy's")) {
			name = "Wendy'S";
		}
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		List<Restaurant> r = mongTemplate.find(query, Restaurant.class);
		
		return r;
		
	}
	
	@RequestMapping(value="/restaurants/count", method = RequestMethod.GET)
	public long count() {
		return repo.count();
	}
	
}
