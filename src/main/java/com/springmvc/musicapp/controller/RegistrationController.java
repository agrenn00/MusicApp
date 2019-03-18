package com.springmvc.musicapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.musicapp.model.User;
import com.springmvc.musicapp.service.UserService;


@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;
	
//	User admin1 = new User("admin", "admin", "admin", "admin", "admin@admin.com", "1234567890");
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
	  	mav.addObject("user", new User());
	  	return mav;
	}
	
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
//		boolean reg1 = userService.register(admin1);
		boolean reg = userService.register(user);
		ModelAndView mav = new ModelAndView();
		if (reg) {
			mav.addObject("REGISTRATIONSTATUSMESSAGE", "User successfully registered");
			mav.setViewName("main");
		}
		else {
			mav.addObject("REGISTRATIONSTATUSMESSAGE", "Username already exists");
			mav.setViewName("register");
		}
		return mav;
	  }
	}
