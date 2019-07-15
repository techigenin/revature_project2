package com.revature.festival.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.festival.logs.LoggingUtil;
import com.revature.festival.util.SessionFactoryUtil;

public class FestivalDriver {
private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		System.out.println("starting");
		Session sess = sf.openSession();
		System.out.println("Got here");
		sess.close();
		LoggingUtil.trace("Everything is fine.");
		System.out.println("Everything is fine.");
	}
}
