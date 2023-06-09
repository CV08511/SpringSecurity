package com.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.User;
import com.spring.security.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServices userservices;
	
	@GetMapping("/")
	public List<User> getAllUser()
	{
		return this.userservices.getAllUser();
	}
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return this.userservices.getUser(username);
	}

}
