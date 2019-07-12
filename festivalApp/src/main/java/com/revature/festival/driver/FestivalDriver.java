package com.revature.festival.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.revature.festival.util.SessionFactoryUtil;

public class FestivalDriver {
private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Session sess = sf.openSession();
		
		sess.close();
		System.out.println("Everything is fine.");
		
	}
}
