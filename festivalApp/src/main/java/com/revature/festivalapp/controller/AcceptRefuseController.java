package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.festivalapp.pojos.AcceptRefuseDTO;
import com.revature.festivalapp.pojos.RegInfo;
import com.revature.festivalapp.services.RegInfoService;

@Controller
public class AcceptRefuseController {

	RegInfoService regInfoService;

	public void setRegInfoService(RegInfoService regInfoService) {
		this.regInfoService = regInfoService;
	}
	
	@PostMapping(value="/accept", consumes={"application/json"})
	public void acceptArtistOffer(AcceptRefuseDTO accept, HttpSession sess) {
		if (sess.getAttribute("user") != null) {
			RegInfo info = regInfoService.getRegInfo(accept.getRequestNumber());
			
			info.setAccepted(accept.getAccept());
			
			regInfoService.updateRegInfo(info);
		}
	}
}
