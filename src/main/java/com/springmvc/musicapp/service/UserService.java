package com.springmvc.musicapp.service;

import com.springmvc.musicapp.model.Login;
import com.springmvc.musicapp.model.User;

public interface UserService {
	
//    boolean findByUserName(String userName);
     
//    void updateUser(User user);
     
//    void deleteUserByUserName(String userName);
	
	User getUser(String userName);
    
    User validateUser(Login login);
    
    boolean register(User user);
 
//    public boolean isUserExist(User user);
}
