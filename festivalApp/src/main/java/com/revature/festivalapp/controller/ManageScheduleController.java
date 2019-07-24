package com.revature.festivalapp.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.ScheduleServices;


public class ManageScheduleController {
			
	ScheduleServices scheduleServices;
	


	@Autowired
	public void setScheduleServices(ScheduleServices scheduleServices) {
		this.scheduleServices = scheduleServices;
	}


	@PostMapping(value="/schedule" ,consumes= {"application/json"})
	public @ResponseBody boolean CreateStagePost(@RequestBody Schedule schedule, HttpSession sess) {

		
		User user =(User) sess.getAttribute("users");
		
		if (user != null) {
		
		scheduleServices.createSchedule(schedule);
		return true;
		
		}

		return false;
		}
	
	@PostMapping(value="/schedule" ,consumes= {"application/json"})
	public @ResponseBody boolean UpdateStagePost(@RequestBody Schedule schedule, HttpSession sess) {

		
		User user =(User) sess.getAttribute("users");
		
		if (user != null) {
		
		scheduleServices.updateSchedule(schedule);
		return true;
		
		}

		return false;
	}
	
	
	@PostMapping(value="/schedule" ,consumes= {"application/json"})
	public @ResponseBody boolean DeleteStagePost(@RequestBody Schedule schedule, HttpSession sess) {

		
		User user =(User) sess.getAttribute("users");
		
		if (user != null) {
		
		scheduleServices.deleteSchedule(schedule);
		return true;
		
		}

		return false;
	}
	
	@PostMapping(value="/schedule" ,consumes= {"application/json"})
	public @ResponseBody boolean SaveOrUpdateStagePost(@RequestBody Schedule schedule, HttpSession sess) {

		
		User user =(User) sess.getAttribute("users");
		
		if (user != null) {
		
		scheduleServices.SaveOrUpdate(schedule);
		return true;
		
		}

		return false;
	}
	
	
	
}
