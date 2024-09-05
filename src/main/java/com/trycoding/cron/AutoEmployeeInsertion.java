package com.trycoding.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.trycoding.entity.Employee;
import com.trycoding.service.EmployeeService;

@Component
public class AutoEmployeeInsertion {
	
	// u can use this for scheduling by annotation 
	
	private EmployeeService employeeService;
	
	private Employee emp ;
	

	public AutoEmployeeInsertion(EmployeeService employeeService) {
		this.employeeService = employeeService;
		this.emp=new Employee("Ahmed" , "pass@aa","pass","asd",1234);
	}



	//@Scheduled(cron = "0 */2 * * * ?")
	public void autoInsert() {
	    // Your logic here
	    int i = employeeService.insertEmployee(this.emp);
	}


}
