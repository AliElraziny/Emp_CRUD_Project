package com.trycoding.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class EmployeeAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String name ; 
	

	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" ,referencedColumnName = "id")
	private Employee employee ;


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



}
