package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.RegInfo;
import com.revature.festivalapp.pojos.RegInfoDTO;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.EventRoleService;
import com.revature.festivalapp.services.RegInfoService;
import com.revature.festivalapp.services.UserService;

@Controller
public class RegRoleController {
	
	private RegInfoService regInfoService;
	private UserService	userService;
	private EventRoleService eventRoleService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Autowired
	public void setEventRoleService(EventRoleService eventRoleService) {
		this.eventRoleService = eventRoleService;
	}

	@Autowired
	public void setRegInfoService(RegInfoService regInfoService) {
		this.regInfoService = regInfoService;
	}

	@PostMapping(value="/role_reg", consumes = {"application/json"})
	public void registerNewRole(@RequestBody RegInfoDTO regDTO, HttpSession sess) {
		RegInfo regInfo = regInfoService.getRegInfo(regDTO.getRequestNumber());
		
		if (regInfo != null && regInfo.isValid()) {
			User newUser = builidUser(regDTO, regInfo);
			EventRole er = buildEventRole(regInfo, newUser);
			
			userService.insertUser(newUser);
			eventRoleService.insertEventRole(er);
			
			regInfo.setValid(false);
			regInfoService.updateRegInfo(regInfo);
			
			sess.setAttribute("user", newUser);
		}
		
	}

	private User builidUser(RegInfoDTO regDTO, RegInfo regInfo) {
		User newUser = new User();
		newUser.setEmail(regDTO.getEmail());
		newUser.setPassword(regDTO.getPassword());
		newUser.addRole(regInfo.getRoleType());
		
		if (newUser.isArtist())
			newUser.setArtistName(regDTO.getName());
		else if (newUser.isPromoter())
			newUser.setPromoterName(regDTO.getName());
		return newUser;
	}

	private EventRole buildEventRole(RegInfo regInfo, User newUser) {
		EventRole er = new EventRole();
		
		er.setEvent(regInfo.getEvent());
		er.setUser(newUser);
		er.setUserRole(regInfo.getRoleType());
		return er;
		}
	}
