package com.trycoding.cron;

import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import com.trycoding.entity.Employee;
import com.trycoding.service.EmployeeService;

public class AutoEmployeeInsertionUsingXml {
	
	// u can use this for scheduling by annotation 
	
	private EmployeeService employeeService;
	
	private Employee emp ;
	
	public AutoEmployeeInsertionUsingXml() {
		this.emp=new Employee("omar" , "pass@aa","pass","asd",1234);
	}



	public void execute() throws JobExecutionException {
		
		int i = employeeService.insertEmployee(this.emp);
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}
