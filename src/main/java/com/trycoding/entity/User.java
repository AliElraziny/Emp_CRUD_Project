package com.trycoding.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_dtls")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String fullname ;
	
	private String address ;
	
	private String email ;
	
	private String password ;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
