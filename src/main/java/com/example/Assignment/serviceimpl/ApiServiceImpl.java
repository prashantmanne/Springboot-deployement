package com.example.Assignment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Assignment.entity.PostsEntity;
import com.example.Assignment.repositary.PostRepo;
import com.example.Assignment.service.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Service
public class ApiServiceImpl implements ApiInterface {

	@Autowired
	RestTemplate rest;
	@Autowired
	PostRepo repo;
	
	
//	@Override
//	public String getData() {

//	    String s = rest.getForObject(
//	            "https://jsonplaceholder.typicode.com/posts",
//	            String.class);
//
//	    Gson gson = new Gson();
//
//	    JsonArray arr = gson.fromJson(s, JsonArray.class);
//
//	    JsonArray result = new JsonArray();
//
//	    arr.forEach(a -> {
//
//	        JsonObject obj = a.getAsJsonObject();
//
//	        JsonObject newObj = new JsonObject();
//
//	        newObj.addProperty("id", obj.get("id").getAsInt());
//	        newObj.addProperty("title", obj.get("title").getAsString());
//
//	        result.add(newObj);
//	    });
//
//	    return result.toString();
		
//http		
		
		
		
		@Override
		public String getData() {
		    String s = rest.getForObject(
		            "https://jsonplaceholder.typicode.com/posts",
		            String.class
		    );
		    
		    Gson gson = new Gson();
		    JsonArray arr = gson.fromJson(s, JsonArray.class);
		    arr.forEach(a -> {
		        JsonObject obj = a.getAsJsonObject();
		        PostsEntity post = new PostsEntity();
		        post.setTitle(obj.get("title").getAsString());
		        post.setUserId(obj.get("userId").getAsInt());
		        post.setBody(obj.get("body").getAsString());
		        repo.save(post);
		    });

		    return "Data Saved";
		}
	
	
	
	
	
	//complitable 
	//complitable feature
	
	
	
	
	
	
	
	
	
	

}
