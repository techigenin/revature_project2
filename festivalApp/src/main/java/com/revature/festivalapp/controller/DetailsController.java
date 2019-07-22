package com.revature.festivalapp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.DetailsDTO;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.FestivalEventServices;
import com.revature.festivalapp.services.UserService;

@Controller
public class DetailsController {
	
	UserService userServices;
	FestivalEventServices festivalEventService;

	public FestivalEventServices getFestivalEventService() {
		return festivalEventService;
	}

	@Autowired
	public void setFestivalEventService(FestivalEventServices festivalEventService) {
		this.festivalEventService = festivalEventService;
	}

	public UserService getUserServices() {
		return userServices;
	}

	@Autowired
	public void setUserServices(UserService userServices) {
		this.userServices = userServices;
	}

	@GetMapping(value="/details")
	public @ResponseBody String sendUserDetails(HttpSession sess) {
		
		User u = (User) sess.getAttribute("user");
		System.out.println(sess.getId());
		
		if (sess.getAttribute("user") != null) {
			u = (User) sess.getAttribute("user");
			List<EventRole> erList = userServices.getAllUserEventsAndRoles(u.getId());
			List<DetailsDTO> retList = new ArrayList<DetailsDTO>();
			
			for (EventRole er : erList) {
				String role = er.getUserRole();
				FestivalEvent event = festivalEventService.getFestivalEvent(er.getEventId());
				String eventName = event.getEventName();
				LocalDate startDate = event.getStartDate();
				LocalDate endDate = event.getEndDate();
				
				retList.add(new DetailsDTO(role, eventName, startDate, endDate));
			}
			
			ObjectMapper om = new ObjectMapper();
			try {
				DetailsDTO[] retArray = retList.toArray(new DetailsDTO[0]);
				
				String retString = om.writeValueAsString(retArray);
				
				return retString;
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

}
