package com.gants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
	public Page<Restaurant> restaurants(Pageable pageable) {
		Page<Restaurant> r = repo.findAll(pageable);
	
		return r;
	}
	
	@RequestMapping(value="/restaurants/restaurantName", method = RequestMethod.GET)
	public Page<Restaurant> grade(@RequestParam("name") String name, Pageable pageable) {
		if(name.equals("Wendy's")) {
			name = "Wendy'S";
		}
		Query query = new Query();
		query.with(pageable);
		query.addCriteria(Criteria.where("name").is(name));
		Long total = mongTemplate.count(query, Restaurant.class);
		List<Restaurant> r = mongTemplate.find(query, Restaurant.class);
		Page<Restaurant> _r = new PageImpl<Restaurant>(r,pageable,total);
		
		return _r;
		
	}
	
	@RequestMapping(value="/restaurants/count", method = RequestMethod.GET)
	public long count() {
		return repo.count();
	}
	
}
