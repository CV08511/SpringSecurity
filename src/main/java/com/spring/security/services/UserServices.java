package com.spring.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.security.model.User;
@Service
public class UserServices {
	
	List<User> list=new ArrayList<>();

	public UserServices() {
		list.add(new User("shaista","123","sh@gmail.com"));
		list.add(new User("neha","1234","neha@gmail.com"));
		list.add(new User("chandan","12345","chan@gmail.com"));
		
		
		
	}
	
	public List<User> getAllUser()
	{
		return this.list;
	}
	public User getUser(String username)
	{
		return this.list.stream().filter((user)->user.getUserName().equals(username)).findAny().get();
	}
	
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
	}
	
	

}
