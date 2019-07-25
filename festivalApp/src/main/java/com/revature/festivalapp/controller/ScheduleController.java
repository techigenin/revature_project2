package com.revature.festivalapp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.festivalapp.pojos.ScheduleDTO;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.services.ScheduleServices;

import com.revature.festivalapp.services.ScheduleServicesImpl;

//@Controller
public class ScheduleController {	
//	private ScheduleServicesImpl scheduleService;
//	
//	
//	@Autowired
//	public void setScheduleService(ScheduleServicesImpl scheduleService) {
//		this.scheduleService = scheduleService;
//	}
//	
//	@GetMapping(value="/schedule")
//	public  @ResponseBody String getSchedulebyUser(String val, String eventNumber, HttpSession sess) {
//		ObjectMapper om = new ObjectMapper();
//		val = sess.getId();
//		
//		try {
//			Integer id = (Integer) om.readValue(val, Integer.class);
//			Integer eventNum = (Integer) om.readValue(eventNumber, Integer.class);
//			
//			if (id != null && eventNum != null) {
//				
//				ScheduleDTO schedule = new ScheduleDTO();
//				ArrayList<ScheduleDTO> schDTOList = new ArrayList<>();
//				
//				
//				
//			}
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//	}

}
