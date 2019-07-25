package com.revature.festivalapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.services.FestivalEventServices;

@Controller("/home")
public class HomeController {
	
	private FestivalEventServices eventService;
	
	@Autowired
	public void setFestivalEventService(FestivalEventServices eventService ) {
		this.eventService = eventService;
	}
	
//	@GetMapping
//	public String homeGet() {
//		return "redirect:/resources/angular/index.html";
//	}
	
	@PostMapping
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
