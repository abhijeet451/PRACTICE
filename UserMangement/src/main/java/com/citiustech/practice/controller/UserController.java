package com.citiustech.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.practice.model.User;
import com.citiustech.practice.serviceImpl.UserRegistrationServiceImpl;

@RestController
@RequestMapping("/APP")
public class UserController {
	
	@Autowired
	private UserRegistrationServiceImpl userRegistration;
	
	@GetMapping("/user")
	public ResponseEntity<Object> logIn(@RequestParam String username) {
		User user =userRegistration.getUserbyEmail(username);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	

}
