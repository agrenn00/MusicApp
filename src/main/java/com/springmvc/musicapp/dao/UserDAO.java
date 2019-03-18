package com.springmvc.musicapp.dao;

import java.util.List;

import com.springmvc.musicapp.model.Login;
import com.springmvc.musicapp.model.User;

public interface UserDAO {
	
	boolean findByUserName(String userName);
	
	 boolean register(User user);

	 User validateUser(Login login);
	 
	 User getUser(String userName);
	 
	 List<User> dummyUsers();
}
