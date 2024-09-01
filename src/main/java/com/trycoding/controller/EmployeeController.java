package com.trycoding.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trycoding.entity.Employee;
import com.trycoding.repository.EmployeeDao;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController {
	
	
	private EmployeeDao employeeDao;
	

	public EmployeeController(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@RequestMapping(path="/addEmployee")
	public String addEmployee() {

		return "employee/add-employee";
	}
	
	@RequestMapping(path="/createEmployee" ,method=RequestMethod.POST)
	public String createEmployee(@ModelAttribute Employee emp , HttpSession httpSession) {
		System.out.println(emp);
		
		int i = employeeDao.saveEmp(emp);
		httpSession.setAttribute("msg", "Employee Added");
		return "redirect:/addEmployee";
	}
	
	@RequestMapping(path="/editEmployee/{id}" )
	public String editEmployee(@PathVariable int id , Model model ) {
		
		Employee emp  = employeeDao.getEmpployeeById(id);
		
		model.addAttribute("emp",emp);
		
		return "employee/edit-employee";
	}
	
	@RequestMapping(path="/updateEmployee" ,method=RequestMethod.POST  )
	public String updateEmployee(@ModelAttribute Employee emp  , HttpSession httpSession) {
		
		employeeDao.updateEmployee(emp);
		httpSession.setAttribute("msg", "Employee "+emp.getId()+"updated");
		
		return "redirect:/home";
	}
	
	@RequestMapping(path="/deleteEmployee/{id}"  )
	public String deleteEmployee(@PathVariable int id , HttpSession httpSession) {
		
		employeeDao.deleteEmployee(id);
		httpSession.setAttribute("msg", "Employee "+id+"deleted");
		return "redirect:/home";
	}

}
