package com.ecom.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecom.web.entity.User;


public interface UserRepository extends JpaRepository<User, String> {
	
	//List<User> findByUserName(String uname);

}
