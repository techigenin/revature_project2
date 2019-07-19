package com.revature.festival.services;

import com.revature.festivalapp.pojos.User;

public interface UserServices {
	
	public User loginUser(String email, String password);
	
	public User saveUser(String email, String password);
	
	
}

