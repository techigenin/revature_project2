package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.services.EventRoleService;
import com.revature.festivalapp.services.FestivalEventServices;
import com.revature.festivalapp.services.ScheduleServices;
import com.revature.festivalapp.services.StageServices;

@Controller
public class EventHomeController {
	

	FestivalEventServices festivalEventServices;
	StageServices stageServices;
	ScheduleServices scheduleServices;
	EventRoleService eventRoleService;
	
	
	public FestivalEventServices getFestivalEventServices() {
		return festivalEventServices;
	}
	@Autowired
	public void setFestivalEventServices(FestivalEventServices festivalEventServices) {
		this.festivalEventServices = festivalEventServices;
	}
	public StageServices getStageServices() {
		return stageServices;
	}
	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}
	public ScheduleServices getScheduleServices() {
		return scheduleServices;
	}
	@Autowired
	public void setScheduleServices(ScheduleServices scheduleServices) {
		this.scheduleServices = scheduleServices;
	}
	public EventRoleService getEventRoleService() {
		return eventRoleService;
	}
	@Autowired
	public void setEventRoleService(EventRoleService eventRoleService) {
		this.eventRoleService = eventRoleService;
	}
	
	@PostMapping("/event_home")
	public @ResponseBody String getEventHome(String info, HttpSession sess ) {
		ObjectMapper om = new ObjectMapper();
		
		
		
		
		
		return null;
	}
}
