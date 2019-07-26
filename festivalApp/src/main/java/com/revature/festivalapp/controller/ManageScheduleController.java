package com.revature.festivalapp.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.ScheduleServices;

@Controller
public class ManageScheduleController {
			
	ScheduleServices scheduleServices;
	


	@Autowired
	public void setScheduleServices(ScheduleServices scheduleServices) {
		this.scheduleServices = scheduleServices;
	}



	
	@PostMapping(path="/manage_schedule" , consumes= {"application/json"})
	public void SaveOrUpdateStagePost(@RequestBody Schedule schedule, HttpSession sess) {

		User user =(User) sess.getAttribute("user");
		
		if (user != null)
			scheduleServices.saveOrUpdate(schedule);
	}
	
	
	
}
