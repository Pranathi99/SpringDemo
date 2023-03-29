package com.examples.SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.SpringMVCDemo.model.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "registerUser";
	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public String SignupUser(@ModelAttribute("user") User user)
	{
		System.out.println("From UI. Retrieved object from spring container");
		ModelAndView mv=new ModelAndView();
		mv.addObject("user", user);
		return "registeruserresult";
	}
}
