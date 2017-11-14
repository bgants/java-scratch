package com.gants.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gants.model.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String>  {	

}
