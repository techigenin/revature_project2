package com.revature.festival.services;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.User;

public interface UserServices {
	
	public User loginUser(String email, String password);
	
	public void registerUser(User user);
	
	
}

