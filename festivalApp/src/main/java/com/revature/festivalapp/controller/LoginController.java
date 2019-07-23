package com.revature.festivalapp.controller;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.pojos.UserDTO;
import com.revature.festivalapp.services.UserService;

@RestController
public class LoginController {
	
	UserService userServices;
	
	UserService getUserServices() {
		return userServices;
	}

	@Autowired
	void setUserServices(UserService userServices) {
		this.userServices = userServices;
	}
	
	@GetMapping(value="/login")
	public String loginGet() {
		return "redirect:resources/login.html";
	}
	
	
	@PostMapping(value="/login")// response to the body http response / takeing the info from the body of http post request
	//responsebody it takes the user to the page
	public @ResponseBody boolean loginPost(@RequestBody String userIn, HttpSession sess) {// userIn it holds the JSON
		ObjectMapper om = new ObjectMapper();
		UserDTO u;
		
		try { //readValue it convert the JSON to an object
			u = (UserDTO) om.readValue(userIn, UserDTO.class);
			
			User validUser = userServices.loginUser(new User(u));
			
			if (validUser != null) {
				sess.setAttribute("user", validUser);
				System.out.println(sess.getId());
				return true;
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}
