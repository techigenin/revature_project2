package com.revature.festival.driver;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.revature.festivalapp.dao.FestivalEventDAO;
import com.revature.festivalapp.dao.FestivalEventDAOImpl;
import com.revature.festivalapp.dao.ScheduleDAO;
import com.revature.festivalapp.dao.ScheduleDAOImpl;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;
import com.revature.festivalapp.pojos.Stage;

public class FestivalDriver {
		
	public static void main(String[] args) {
	FestivalEventDAO fd = new FestivalEventDAOImpl();
	ScheduleDAO s= new ScheduleDAO();	
	
	
//	System.out.println(s.ViewAllSchedule());
////	User user = new User("Mah", "123", "Artist","Nick", null, null);
//	
//	UserDAOImpl ud= new UserDAOImpl();
//	//ud.insertUser(user);
////	
//	FestivalEvent fe = new FestivalEvent(2500, "Fun Days", "The PArk", LocalDate.parse("2019-09-01"), LocalDate.parse("2019-09-09"), "Fun for everyone", ud.getUser(1)); 
//			fd.insertFestivalEvent(fe);
//	ScheduleEmbedded se = new ScheduleEmbedded(new Stage(5,1,"Revature",ud.getUser(1)),LocalDateTime.parse("2019-09-01T10:10:10"));	
//	Schedule sc = new Schedule(se, null, "Mohamad")	;	
//			s.AddSchedule(sc);
			
		System.out.println(s.ViewAllSchedule());
		System.out.println("updated");
	}
}
