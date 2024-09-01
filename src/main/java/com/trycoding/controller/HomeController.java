package com.trycoding.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trycoding.entity.Employee;
import com.trycoding.repository.EmployeeDao;


@Controller
public class HomeController {
	
	private EmployeeDao employeeDao;
	

	public HomeController(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	@RequestMapping(path="/home")
	public String homeController(Model model) {
		
		List<Employee> employees = employeeDao.getAllEmployees();
		model.addAttribute("employees" ,employees);

		return "home";
	}
	
	@RequestMapping(path="/login")
	public String login() {

		return "user/login";
	}
	@RequestMapping(path="/register")
	public String register(Model model) {

		return "user/register";
	}
	
	
	
	
	
	
	

}
