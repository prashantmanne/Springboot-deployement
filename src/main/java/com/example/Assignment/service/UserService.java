package com.example.Assignment.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Assignment.bean.Userdata;

public interface UserService {
	 List<Userdata> fulldata(@RequestBody List<Userdata> req,@PathVariable int age);
}
