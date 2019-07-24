package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.pojos.UserDTO;
import com.revature.festivalapp.services.UserService;

@Controller("/login")
public class LoginController {
	
	UserService userServices;
	
	UserService getUserServices() {
		return userServices;
	}

	@Autowired
	void setUserServices(UserService userServices) {
		this.userServices = userServices;
	}
	
//	@GetMapping
//	public String loginGet() {
//		return "redirect:resources/login.html";
//	}
	
	@PostMapping(path="/login", consumes={"application/json"})
	public @ResponseBody boolean loginPost(@RequestBody UserDTO u, HttpSession sess) {
		User validUser = userServices.loginUser(new User(u));
		
		if (validUser != null) {
			sess.setAttribute("user", validUser);
			System.out.println(sess.getId());
			return true;
		}
		
		return false;
	}
}
