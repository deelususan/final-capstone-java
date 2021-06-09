package com.ecom.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.User;
import com.ecom.web.service.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService userservice;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")


	// Add a User
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userservice.addMyUser(user);
	}
	
	//Get all Users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userservice.geAllMyUsers();

	}
	


	
	
}
