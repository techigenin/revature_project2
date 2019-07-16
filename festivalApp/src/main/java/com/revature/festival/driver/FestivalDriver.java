package com.revature.festival.driver;

import org.hibernate.SessionFactory;

import com.revature.festival.logs.LoggingUtil;
import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.dao.ManagerDAO;
import com.revature.festivalapp.dao.ManagerDAOImpl;
import com.revature.festivalapp.pojos.Manager;

public class FestivalDriver {
private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		System.out.println("starting");
		ManagerDAO md = new ManagerDAOImpl();
		
		Manager m = new Manager("John Doe");
		m.setCollectedRoles("manager");
		m.setEmail("fake@yahoo.com");
		m.setPassword("password");
		
		md.insertManager(m);
		
		LoggingUtil.trace("Everything is fine.");
		System.out.println("Everything is fine.");
	}
}
