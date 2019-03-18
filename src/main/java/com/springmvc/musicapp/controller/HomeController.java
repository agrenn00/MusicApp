//package com.springmvc.musicapp.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//
//	@RequestMapping(value="/home")
//	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
//		ModelAndView ret = new ModelAndView("home");
//		// Adds an object to be used in home.jsp
//		ret.addObject("name", name);
//		return ret;
//	}
	
//	@RequestMapping(value="/register")	
//	public String showPage2() {
//		return "register";
//	}
//}
