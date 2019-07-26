package com.revature.festivalapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.services.FestivalEventServicesImpl;

//@RestController("/events/home")
@Controller
public class EventsHomeController {
	
	private FestivalEventServicesImpl eventService;
	
	@Autowired
	public void setFestivalEventService(FestivalEventServicesImpl eventService ) {
		this.eventService = eventService;
	}
	
	@GetMapping(path="/events/home",produces = {"application/json"})
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

