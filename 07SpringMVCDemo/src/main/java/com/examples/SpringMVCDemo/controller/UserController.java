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
	public ModelAndView showRegistrationPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registerUser");
		return mv;
	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public ModelAndView SignupUser(@ModelAttribute("user") User user)
	{
		System.out.println("From UI. Retrieved object from spring container");
		ModelAndView mv=new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("registeruserresult");
		return mv;
	}
}
