package com.trycoding.service;

import org.springframework.stereotype.Service;

import com.trycoding.entity.Employee;
import com.trycoding.repository.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		
	}


	@Override
	public int insertEmployee(Employee emp) {
		return employeeDao.saveEmp(emp);
	}

}
