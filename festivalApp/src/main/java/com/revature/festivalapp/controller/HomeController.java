package com.revature.festivalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	
	@GetMapping(value="/home")
	public String loginGet() {
		return "redirect:resources/angular/index.html";
	}

}
