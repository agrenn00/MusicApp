package com.springmvc.musicapp.service;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.musicapp.model.Login;
import com.springmvc.musicapp.model.User;
import com.springmvc.musicapp.dao.UserDAO;


	@Service("userService")
	@Transactional
	public class UserServiceImpl implements UserService {
		
//		private static List<User> users = new ArrayList<User>() {};
		@Autowired
	    public UserDAO userDao;

	     
//	    public boolean findByUserName(String userName) {
//	        for(User user : users){
//	            if(user.getUserName().equalsIgnoreCase(userName)){
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
	     
//	    public void updateUser(User user) {
//	        int index = users.indexOf(user);
//	        users.set(index, user);
//	    }
//	 
//	    public void deleteUserByUserName(String userName) {
//	         
//	        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
//	            User user = iterator.next();
//	            if (user.getUserName() == userName) {
//	                iterator.remove();
//	            }
//	        }
//	    }
		
		public User getUser(String userName) {
			return userDao.getUser(userName);
		}
	    
	    public boolean register(User user) {
	    	
	    		boolean res = userDao.register(user);
	    		return res;
	    }

	    public User validateUser(Login login) {
	      return userDao.validateUser(login);
//	    	return null;
	    }
	 
//	    public boolean isUserExist(User user) {
//	        return findByUserName(user.getUserName())!=null;
//	    }
	 
	}

