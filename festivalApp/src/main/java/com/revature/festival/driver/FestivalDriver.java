package com.revature.festival.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.festival.logs.LoggingUtil;
import com.revature.festival.util.SessionFactoryUtil;

public class FestivalDriver {
private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Session sess = sf.openSession();
		
		sess.close();
		LoggingUtil.trace("Everything is fine.");
		
	}
}
