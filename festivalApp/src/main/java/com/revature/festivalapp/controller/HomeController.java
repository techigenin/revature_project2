package com.revature.festivalapp.controller;

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

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.services.FestivalEventServicesImpl;

@RestController("/home")
public class HomeController {
	
	private FestivalEventServicesImpl eventService;
	
	@Autowired
	public void setFestivalEventService(FestivalEventServicesImpl eventService ) {
		this.eventService = eventService;
	}
	
	@GetMapping(value="/home")
	public List<FestivalEvent> getAllFestivalEvents() {
		return eventService.viewAllEvents();
	}

}
