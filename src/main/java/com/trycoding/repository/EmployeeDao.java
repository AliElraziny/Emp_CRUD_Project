package com.trycoding.repository;

import java.util.List;

import com.trycoding.entity.Employee;

public interface EmployeeDao {
	
	public int saveEmp(Employee emp);
	
	public Employee getEmpployeeById(int id );
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(int id );
	
	

}
