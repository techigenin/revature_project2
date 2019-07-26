package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.StageServices;

@Controller
public class ManageStageController {

	StageServices stageServices;
		
	@Autowired
	public void setStageServices(StageServices stageServices) {
		this.stageServices = stageServices;
	}

	

	
	@PostMapping(value="/manage_stage", consumes= {"application/json"})
	public void SaveOrUpdateStagePost(@RequestBody Stage stage, HttpSession sess) {

		User user =(User) sess.getAttribute("user");
		
		if (user != null)
			stageServices.saveOrUpdateStage(stage);	
	}
}
