package com.revature.festivalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	
	@GetMapping(value="/home")
	public String loginGet() {
		return "redirect:resources/angular/index.html";

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.services.FestivalEventServicesImpl;

@Controller
public class HomeController {
	
	private FestivalEventServicesImpl eventService;
	
	@Autowired
	public void setFestivalEventService(FestivalEventServicesImpl eventService ) {
		this.eventService = eventService;
	}
	
	@GetMapping("/home")
	public @ResponseBody String getAllFestivalEvents() {
		ObjectMapper om = new ObjectMapper();
		List<FestivalEvent> feList = eventService.viewAllEvents();
		
		try {
			return om.writeValueAsString(feList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}