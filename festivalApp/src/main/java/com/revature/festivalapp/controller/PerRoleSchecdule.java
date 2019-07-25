package com.revature.festivalapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.RoleScheduleDTO;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.FestivalEventServices;
import com.revature.festivalapp.services.ScheduleServices;
import com.revature.festivalapp.services.StageServices;

@Controller
public class PerRoleSchecdule {
	
	ScheduleServices scheduleServices;
	FestivalEventServices festivalEventServices;
	StageServices stageServices;
	
	@Autowired
	public void setScheduleServices(ScheduleServices scheduleServices) {
		this.scheduleServices = scheduleServices;
	}
	
	@Autowired
	public void setFestivalEventServices(FestivalEventServices festivalEventServices) {
		this.festivalEventServices = festivalEventServices;
	}
	
	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}

	@PostMapping(path="/schedule", consumes="application/json", produces="application/json")
	public @ResponseBody Schedule[] getRoleSchedules(RoleScheduleDTO dto, HttpSession sess ) {
		User u = (User) sess.getAttribute("user");
		FestivalEvent fe = festivalEventServices.getFestivalEvent(dto.getEventNum());
		List<Stage> stages = stageServices.getStagesByEvent(fe);
		
		List<Schedule> schedList = new ArrayList<Schedule>();
		
		if ( u != null ) {
			if (dto.getRole().equalsIgnoreCase("artist")) 
				getArtistSchedules(u, fe, stages, schedList);
			else if (dto.getRole().equalsIgnoreCase("crew"))
				getCrewSchedules(u, fe, stages, schedList);
			else if (dto.getRole().equalsIgnoreCase("promoter"))
				getPromoterSchedule(stages, schedList);
		}
		
		return schedList.toArray(new Schedule[0]);
	}

	private void getPromoterSchedule(List<Stage> stages, List<Schedule> schedList) {
		for (Stage s : stages) 
			schedList.addAll(scheduleServices.getSchedulesByStage(s));
	}

	private void getCrewSchedules(User u, FestivalEvent fe, List<Stage> stageList, List<Schedule> schedList) {
		for (Stage s : stageList) {
			if (s.getCrew().equals(u)) {
				schedList.addAll(scheduleServices.getSchedulesByStage(s));
			}
		}
	}

	private void getArtistSchedules(User u, FestivalEvent fe, List<Stage> stageList, List<Schedule> schedList) {
		for (Stage s : stageList)
			schedList.addAll(scheduleServices.getArtistStageSchedules(s, u));
	}

}
