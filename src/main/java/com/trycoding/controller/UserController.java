package com.trycoding.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trycoding.entity.User;
import com.trycoding.repository.UserDao;

@Controller
@RequestMapping(path="/user")
public class UserController {
	
	private UserDao userDao;

	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@RequestMapping(path="/createUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User usr) {
		int id = userDao.saveUser(usr);
		return "redirect:/login";
	}
	
	@RequestMapping(path="/loginUser" , method = RequestMethod.POST)
	public String registerUser(@RequestParam("email") String email ,@RequestParam("password") String password 
								,HttpSession session) {
		User usr = userDao.loginUser(email, password);
		
		if(usr != null) {
			session.setAttribute("usrObj", usr);
			return "redirect:/home";
		}
		session.setAttribute("msg", "login failed");
		return "redirect:/login";
	}
	
	@RequestMapping(path = "/logoutUser")
	public String logoutUser(HttpServletRequest request) {
	    HttpSession session = request.getSession(false); // Get the session without creating a new one
	    if (session != null) {
	        session.invalidate(); // Invalidate the session to clear all attributes and terminate the session
	    }
	    return "redirect:/login"; // Redirect to login page after logging out
	}
	
	@RequestMapping(path="/myProfile")
	public String myProfile() {
		
		return "user/profile";
	}
	
	
	
	
	

}
