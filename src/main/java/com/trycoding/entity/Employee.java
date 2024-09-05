package com.trycoding.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp_dtls")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String fullName ;
	

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EmployeeAddress> addresses ; 
	
	private String email ;
	
	private String password ;
	
	private String designation ;
	
	private int salary ;
	
	

	public Employee() {
	}

	public Employee(String fullName, String email, String password, String designation,
			int salary) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
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

	public List<EmployeeAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<EmployeeAddress> addresses) {
		this.addresses = addresses;
	}

	
	
	

}
