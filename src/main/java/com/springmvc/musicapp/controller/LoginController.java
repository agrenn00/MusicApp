package com.springmvc.musicapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.springmvc.musicapp.model.Login;
import com.springmvc.musicapp.model.User;
import com.springmvc.musicapp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("home");
	    mav.addObject("login", new Login());
	    return mav;
	}
	  
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    User user = userService.validateUser(login);
	    if (user != null) {
	    	mav = new ModelAndView("main");
	    	mav.addObject("firstName", user.getFirstName());
	    } 
	    else {
	    	mav = new ModelAndView("home");
	    	mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	}
