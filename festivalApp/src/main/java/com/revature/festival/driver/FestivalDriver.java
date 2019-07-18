package com.revature.festival.driver;

import org.hibernate.SessionFactory;


import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.dao.ScheduleDAO;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;
import com.revature.festival.logs.LoggingUtil;
import com.revature.festivalapp.dao.FestivalEventDAO;
import com.revature.festivalapp.dao.FestivalEventDAOImpl;
import com.revature.festivalapp.dao.StageDAO;
import com.revature.festivalapp.dao.StageDAOImpl;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;


public class FestivalDriver {
	
	public static SessionFactory sf=SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		

	ScheduleDAO s= new ScheduleDAO();
	
	ScheduleEmbedded se=new ScheduleEmbedded(new Stage(),null);
	
	s.AddSchedule(new Schedule( se, null , "Hijazi"));
	System.out.println("updated");
		
		
		
		
		StageDAO sd = new StageDAOImpl();
		
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
		
//	User u = new User("this@thatmail.com", "myPassword", "manager, artist", "Rolando Casos", "Pisco Sour", null);
//				
//		ud.insertUser(u);
		
		//Stage newstage = new Stage(1, 3, "Lolapalooza" , u);
		
		
		
//		for (FestivalEvent fe : fd.getAllFestivalEventsByManager(ud.getUserByEmail("this@thatmail.com")))
//			System.out.println(fe.getEventName());
//		
//		LoggingUtil.trace("Everything is fine.");
//		System.out.println("Everything is fine.");

	}
}
