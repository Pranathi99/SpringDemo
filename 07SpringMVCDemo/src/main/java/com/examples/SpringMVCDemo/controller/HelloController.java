package com.examples.SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.SpringMVCDemo.model.Employee;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView=new ModelAndView();
		modelView.setViewName("hello");
		modelView.addObject("id", 1);
		modelView.addObject("fname", "Ben");
		modelView.addObject("lname", "Wilson");
		return modelView;
	}
	
	@RequestMapping("/readObject")
	public ModelAndView read2() {
		ModelAndView modelView=new ModelAndView();
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Max");
		emp.setSalary(35242.42);
		modelView.addObject("employee", emp);
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelView = new ModelAndView();
		List<Employee>employees=new ArrayList<>();
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Max");
		emp1.setSalary(35342.42);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Kate");
		emp2.setSalary(36562.52);
		
		Employee emp3=new Employee();
		emp3.setId(1);
		emp3.setName("Lisa");
		emp3.setSalary(25242.52);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		modelView.addObject("employees", employees);
		modelView.setViewName("employees");
		return modelView;
		
	}
	
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name)
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.setViewName("showdata");
		return mv;
	}
}
