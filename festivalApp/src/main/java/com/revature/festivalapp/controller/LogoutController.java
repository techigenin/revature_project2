package com.revature.festivalapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

	@GetMapping("/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/resources/angular/index.html";
	}
	
}
