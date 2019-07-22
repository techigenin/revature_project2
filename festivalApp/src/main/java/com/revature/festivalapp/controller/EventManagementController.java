package com.revature.festivalapp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.EventManagementDTO;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.services.EventRoleService;
import com.revature.festivalapp.services.FestivalEventServices;
import com.revature.festivalapp.services.ScheduleServices;
import com.revature.festivalapp.services.StageServices;

@Controller
public class EventManagementController {

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

	public StageServices getStageServices() {
		return stageServices;
	}

	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}

	@GetMapping(value="/manage_event")
	public @ResponseBody String getManageEvent(String val, HttpSession sess) {
		ObjectMapper om = new ObjectMapper();
		
		try {
				Integer id = (Integer) om.readValue(val, Integer.class);
				
				if (id != null) {	
					FestivalEvent fe = festivalEventServices.getFestivalEvent(id);
					
					if (fe != null) {
						EventManagementDTO emDTO = new EventManagementDTO();
						emDTO.setStages(stageServices.getStagesByEvent(fe).toArray(new Stage[0]));
						emDTO.setEventRoles(eventRoleService.getEventRolesByEvent(fe).toArray(new EventRole[0]));
						
						ArrayList<Schedule> schList = new ArrayList<>();
						
						for (Stage s : emDTO.getStages()) 
							schList.addAll(scheduleServices.getSchedulesByStage(s));
							
						emDTO.setSchedules(schList.toArray(new Schedule[0]));
						
						return om.writeValueAsString(emDTO);	
					}
				}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
