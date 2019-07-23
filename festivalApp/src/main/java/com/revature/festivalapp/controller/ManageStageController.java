package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.StageServices;

public class ManageStageController {

	StageServices stageServices;
	
	
	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}



	@PostMapping(value="/stage")
	public @ResponseBody boolean StagePost(@RequestBody Stage stage, HttpSession sess) {

		User user =(User) sess.getAttribute("users");
		stage.setCrew(user);
		stageServices.createStage(stage);
		

		return true;
	}
	
	
}
