package com.springmvc.musicapp.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
 
import com.springmvc.musicapp.model.User;
import com.springmvc.musicapp.service.UserService;

@RestController
public class UserController {

	@Autowired
    UserService userService;
	
	@RequestMapping(value = "/user/{userName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable("userName") String userName) {
        System.out.println("Fetching User with userName " + userName);
        User user = userService.getUser(userName);
        if (user == null) {
            System.out.println("User with user name " + userName + " not found");
            return null;
        }
        return user;
    }
}
