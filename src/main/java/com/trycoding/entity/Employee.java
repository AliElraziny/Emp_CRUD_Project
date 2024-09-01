package com.trycoding.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_dtls")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String fullName ;
	
	private String Address ; 
	
	private String email ;
	
	private String password ;
	
	private String designation ;
	
	private int salary ;

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return Address;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
