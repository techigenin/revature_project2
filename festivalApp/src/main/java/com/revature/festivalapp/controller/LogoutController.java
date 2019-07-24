package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/logout")
public class LogoutController {

	@GetMapping
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/resources/angular/index.html";
	}
	
}
