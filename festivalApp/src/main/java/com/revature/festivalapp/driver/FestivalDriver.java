package com.revature.festivalapp.driver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.festivalapp.dao.FestivalEventDAO;
import com.revature.festivalapp.dao.FestivalEventDAOImpl;
import com.revature.festivalapp.dao.ScheduleDAO;
import com.revature.festivalapp.dao.ScheduleDAOImpl;
import com.revature.festivalapp.dao.StageDAO;
import com.revature.festivalapp.dao.StageDAOImpl;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.services.UserService;
import com.revature.festivalapp.services.UserServiceImpl;
import com.revature.festivalapp.util.SessionFactoryUtil;

public class FestivalDriver {
	
	public static void main(String[] args) {
		System.out.println("starting");
		
		UserDAO ud = new UserDAOImpl();
		FestivalEventDAO fd = new FestivalEventDAOImpl();
		StageDAO sd = new StageDAOImpl();	
		ScheduleDAO schd= new ScheduleDAO();	

		
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
//		
//	User u = new User("this@thatmail.com", "myPassword", "manager, artist", "Rolando Casos", "Pisco Sour", null);
//				ud.insertUser(u);
//				
				
		
		 
		//THIS WORKS
		//Stage newstage = new Stage(25, fd.getFestivalEventById(1), "newStage", ud.getUser(1));
		//sd.insertStage(newstage);
		
		//Stage newstage2 = new Stage (30, fd.getFestivalEventById(1), "newStage", ud.getUser(1));
		//sd.insertStage(newstage2);
		//newstage2.setStageName("gotYou");
		//sd.updateStage(newstage2);
		//sd.getStageById(30);
		//		for (Stage st :sd.getAllStages()) 
//		System.out.println(st.getStageName());
		
		

		
		
		
		
		//sd.deleteStage(newstage2);
//		 updateStage(Stage stage);
//		
//		insertStage(Stage stage);
//		
//	    deleteStage(Stage stage);
//		
//		 getStagebyName(String stagename);
//		
//		 getStageById(int id);
//		
//		public List<Stage> getAllStages();

	
	
	
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
		
//		Schedule sch = new Schedule(
//					new ScheduleEmbedded(
//							sd.getStageById(25), 
//							LocalDateTime.parse("2019-09-01T18:00:00")), 
//					LocalDateTime.parse("2019-09-01T22:00:00"), 
//					ud.getUser(1).getArtistName());
//		
//		schd.AddSchedule(sch);
//		
//		System.out.println(s.ViewAllSchedule());
		
//		for (Schedule sch : schd.ViewAllSchedule())
//			System.out.println(sch.getSe().getStageNumber());
	
		UserService us = new UserServiceImpl();
		
		System.out.println(ud.getUserByEmail("this@thatmail.com"));
		
		for (User u : ud.getAllUsers()) {
			System.out.println(u);
			us.loginUser(u);
		}
		
		System.out.println("Done!");
	}
}
