package com.trycoding.repository;

import com.trycoding.entity.User;

public interface UserDao {
	
	public int saveUser(User emp);
	
	public User loginUser(String email , String password);

}
