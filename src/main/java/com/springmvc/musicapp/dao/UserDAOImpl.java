package com.springmvc.musicapp.dao;

import com.springmvc.musicapp.model.User;
import com.springmvc.musicapp.model.Login;

import java.util.ArrayList;
import java.util.List;

//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{
	
//	@Autowired
//	DataSource datasource;
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	List<User> users = dummyUsers();
//	User admin1 = new User("admin", "admin", "admin", "admin", "admin@admin.com", "1234567890");
//	users.add(admin1);
	
	public boolean findByUserName(String userName) {
        for(User user : users){
            if(user.getUserName().equalsIgnoreCase(userName)){
                return true;
            }
        }
        return false;
    }
//
	 public boolean register(User user) {

		 if (!findByUserName(user.getUserName())) {
	    		users.add(user);
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
		 
	 }
//
	 public User validateUser(Login login) {

		 for(User user : users) {
			 if ((user.getUserName().equalsIgnoreCase(login.userName)) && (user.getPassword().contentEquals(login.password))) {
				 return user;
			 }
		 }
		 return null;
	 }
	 
	 public User getUser(String userName) {
		 for(User user : users) {
			 if (user.getUserName() == userName) {
				 return user;
			 }
		 }
		return null;
	 }
	 
	 public List<User> dummyUsers() {
		 List<User> users = new ArrayList<User>();
		 users.add(new User("admin", "admin", "admin", "abcd1234", "admin@gmail.com", ""));
		 users.add(new User("Alexander", "Grenn", "alex", "abcd1234", "agrenn00@gmail.com", ""));
		 return users;
	 }
}
