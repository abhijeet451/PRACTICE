package com.citiustech.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/APP")
public class UserController {
	
	@GetMapping("/login")
	public ResponseEntity<String> logIn() {
		return new ResponseEntity<>("Logged In",HttpStatus.OK);
	}
	

}
