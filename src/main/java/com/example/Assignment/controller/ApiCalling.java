package com.example.Assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.bean.ApiBean;
import com.example.Assignment.service.ApiInterface;

@RestController
public class ApiCalling {
	@Autowired 
	private ApiInterface service;
	@GetMapping("/api/get-data")
	public String getData() {
		return service.getData();
		
	}

}
