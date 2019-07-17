package com.revature.festival.driver;

import com.revature.festival.logs.LoggingUtil;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.User;

public class FestivalDriver {
	
	public static void main(String[] args) {
		System.out.println("starting");
		

		UserDAO ud = new UserDAOImpl();
		User u = ud.getUserByEmail("userEmail@site.com");
		
		System.out.println(u.getArtistName());
		
		LoggingUtil.trace("Everything is fine.");
		System.out.println("Everything is fine.");
	}
}
