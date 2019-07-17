package com.revature.festival.driver;

import java.time.LocalDate;

import com.revature.festival.logs.LoggingUtil;
import com.revature.festivalapp.dao.FestivalEventDAO;
import com.revature.festivalapp.dao.FestivalEventDAOImpl;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;

public class FestivalDriver {
	
	public static void main(String[] args) {
		System.out.println("starting");
		UserDAO ud = new UserDAOImpl();
		FestivalEventDAO fd = new FestivalEventDAOImpl();
		
//		FestivalEvent fest = new FestivalEvent(
//				2000, 
//				"fun Days", 
//				"The park", 
//				LocalDate.parse("2019-08-01"), 
//				LocalDate.parse("2019-08-09"), 
//				"Fun for whole family",
//				ud.getUserByEmail("this@thatmail.com"));
//		
//		fd.insertFestivalEvent(fest);
		
//		User u = new User("this@thatmail.com", "myPassword", "manager, artist", "Rolando Casos", "Pisco Sour", null);
				
//		ud.insertUser(u);
		
		for (FestivalEvent fe : fd.getAllFestivalEventsByManager(ud.getUserByEmail("this@thatmail.com")))
			System.out.println(fe.getEventName());
		
		LoggingUtil.trace("Everything is fine.");
		System.out.println("Everything is fine.");
	}
}
