package com.citiustech.practice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.citiustech.practice.model.User;
import com.citiustech.practice.repository.UserRepository;

@Service
public class UserRegistrationServiceImpl {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public void registerUser(User user) {
		String encodedPass=passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPass);
		userRepository.save(user);
	}
}
