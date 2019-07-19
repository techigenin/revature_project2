package com.revature.festival.driver;

import java.time.LocalDate;
import java.util.List;

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
	
	public static void main(String[] args) {
		System.out.println("starting");
		UserDAO ud = new UserDAOImpl();
		FestivalEventDAO fd = new FestivalEventDAOImpl();
		
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
		
	//User u = new User("this@thatmail.com", "myPassword", "manager, artist", "Rolando Casos", "Pisco Sour", null);
				
		//ud.insertUser(u);
		 
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
		
		
		
		
		
//		for (FestivalEvent fe : fd.getAllFestivalEventsByManager(ud.getUserByEmail("this@thatmail.com")))
//			System.out.println(fe.getEventName());
//		
//		LoggingUtil.trace("Everything is fine.");
//		System.out.println("Everything is fine.");
	}
}
