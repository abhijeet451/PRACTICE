package com.citiustech.practice.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.practice.model.User;
import com.citiustech.practice.serviceImpl.UserRegistrationServiceImpl;

@RestController
@RequestMapping("register")
@CrossOrigin("http://imcybcp40-msl1:4200")
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationServiceImpl userRegistration;
	
	@PostMapping("/user")
	public void registerUser(@RequestBody User user) {
		//do register or create user here
		userRegistration.registerUser(user);
	}
	
	@GetMapping("/getuser/{username}")
	public ResponseEntity<User> logIn(@PathVariable ("username") String username) {
		System.out.println("Requested user "+ username);
		User user =userRegistration.getUserbyEmail(username);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}
