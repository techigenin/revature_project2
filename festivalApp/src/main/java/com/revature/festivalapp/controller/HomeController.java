package com.revature.festivalapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.services.FestivalEventServicesImpl;

public class HomeController {
	
	private FestivalEventServicesImpl eventService;
	
	@Autowired
	public void setFestivalEventService(FestivalEventServicesImpl eventService ) {
		this.eventService = eventService;
	}
	
	@PostMapping("/home")
	public List<FestivalEvent> getAllFestivalEvents() {
		return eventService.viewAllEvents();
	}

}
