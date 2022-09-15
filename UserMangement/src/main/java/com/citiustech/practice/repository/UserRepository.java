package com.citiustech.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.practice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);

}
