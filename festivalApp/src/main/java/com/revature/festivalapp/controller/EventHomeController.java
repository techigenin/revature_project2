package com.revature.festivalapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.EventHomeDTO;
import com.revature.festivalapp.pojos.EventManagementDTO;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleDTO;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.services.EventRoleService;
import com.revature.festivalapp.services.FestivalEventServices;
import com.revature.festivalapp.services.ScheduleServices;
import com.revature.festivalapp.services.StageServices;

@Controller
public class EventHomeController {
	
	FestivalEventServices festivalEventServices;
	StageServices stageServices;
	ScheduleServices scheduleServices;
	
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

	public StageServices getStageServices() {
		return stageServices;
	}

	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}

	@GetMapping(path = "/event_home", 
			produces={"application/json"})
	public @ResponseBody EventHomeDTO getManageEvent(Integer id) {
		EventHomeDTO ehDTO = new EventHomeDTO();
		if (id != null) {	
			FestivalEvent fe = festivalEventServices.getFestivalEvent(id);
			
			if (fe != null) {
				
				ehDTO.setStages(stageServices.getStagesByEvent(fe).toArray(new Stage[0]));
				
				ArrayList<ScheduleDTO> schDTOList = new ArrayList<>();
				
				for (Stage s : ehDTO.getStages()) {
					
					List<Schedule> schedList = scheduleServices.getSchedulesByStage(s);
					
					for (Schedule sched : schedList)
						schDTOList.add(new ScheduleDTO(sched));
				}
				
				ehDTO.setScheduleDTOs(schDTOList.toArray(new ScheduleDTO[0]));
			
				return ehDTO;
			}
		}		
		return null;
	}
}
