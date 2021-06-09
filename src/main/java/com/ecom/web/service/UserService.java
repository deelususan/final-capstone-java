package com.ecom.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.web.entity.User;
import com.ecom.web.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;

	public User addMyUser(User user) {
		return userrepository.save(user);
	
	}
	
	// Get All Users
		public List<User> geAllMyUsers() {
			return userrepository.findAll();

		}
		
	

}
