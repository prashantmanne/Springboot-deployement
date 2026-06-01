package com.example.Assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.bean.Userdata;

@RestController
public class UserController {
	@PostMapping("/api/data/{age}")
	private List<Userdata> fulldata(@RequestBody List<Userdata> req,@PathVariable int age){
//		List<Userdata> result=new ArrayList<Userdata>();
//		for (Userdata userdata : req) {
//			
//			if(userdata.getAge()<age) {
//				result.add(userdata);
//				
//			}
//			
//		}
//		return result;
		return req.stream().filter(i->i.getAge()<=age).toList();
		
	}
	
}
