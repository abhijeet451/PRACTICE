package com.citiustech.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.practice.model.User;
import com.citiustech.practice.serviceImpl.UserRegistrationServiceImpl;

@RestController
@RequestMapping("/register")
public class UserRegistration {
	
	@Autowired
	private UserRegistrationServiceImpl userRegistration;
	
	@PostMapping("/user")
	public void registerUser(@RequestBody User user) {
		//do register or create user here
		userRegistration.registerUser(user);
	}
}
