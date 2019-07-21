package com.revature.festivalapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.pojos.UserDTO;
import com.revature.festivalapp.services.UserService;
import com.revature.festivalapp.services.UserServiceImpl;


@Controller
public class LoginController {
	
	UserService userService;

	UserService getUserService() {
		return userService;
	}

	void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value="/login", produces="text/html")
	public @ResponseBody String loginGet(HttpSession sess, ModelMap mMap) {
		
		return "<h1>This is my Text</h1>";
	}
	
	@PostMapping(value="/login")
	public @ResponseBody boolean loginPost(@RequestBody String userIn, HttpSession sess) {
		ObjectMapper om = new ObjectMapper();
		UserDTO u;
		try {
			u = (UserDTO) om.readValue(userIn, UserDTO.class);

			User validUser = userService.loginUser(new User(u));
			
			if (validUser != null) {
				sess.setAttribute("user", validUser);
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
	
	@PostMapping(value="/userdetails")
	public @ResponseBody String sendUserDetails(@RequestBody String userName, HttpSession sess) {
		
		List<EventRole> evRoleList = new ArrayList<EventRole>();
		
		if (sess.getAttribute("user") != null && 
				userName.equals(((User)sess.getAttribute("user")).getEmail())) {
			evRoleList.addAll(userService.getAllUserEventsAndRoles
					(((User)sess.getAttribute("user")).getId()));
		}
			
		ObjectMapper om = new ObjectMapper();
		try {
			String retVal = om.writeValueAsString(evRoleList.toArray(new EventRole[0]));
			return retVal;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
