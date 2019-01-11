package com.ssb.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.data.mongodb.core.query.Query;
import com.ssb.spring.bean.Business;

@Service("carService")
public class BusinessService {

	 @Autowired
	    MongoTemplate mongoTemplate;
	 
	    final String COLLECTION = "businesses";
	    
	    public void create(Business business) {
	        mongoTemplate.insert(business);
	    }
	 
	    public void update(Business business) {
	        mongoTemplate.save(business);
	    }
	 
	    public void delete(Business business) {
	        mongoTemplate.remove(business);
	    }
	 
	    public void deleteAll() {
	        mongoTemplate.remove(new Query(), COLLECTION);
	    }
	 
	    public Business find(Business business) {
	        Query query = new Query(Criteria.where("_id").is(business.getId()));
	        return mongoTemplate.findOne(query, Business.class, COLLECTION);
	    }
	 
	    public List < Business > findAll() {
	        return (List < Business > ) mongoTemplate.findAll(Business.class);
	    }
	 
	
}
