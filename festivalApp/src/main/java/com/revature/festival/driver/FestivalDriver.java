package com.revature.festival.driver;



import org.hibernate.SessionFactory;


import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.dao.ScheduleDAO;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;



public class FestivalDriver {
	public static SessionFactory sf=SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		
	ScheduleDAO s= new ScheduleDAO();
	ScheduleEmbedded se=new ScheduleEmbedded(2,null);
	s.AddSchedule(new Schedule( se, null , "Hijazi"));
			System.out.println("updated");
		
		
		
		
	}
}
