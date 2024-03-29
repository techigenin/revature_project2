package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.User;

public interface UserService {
	
	public User loginUser(User u);
	
	public void registerUser(User u);

	public List<EventRole> getAllUserEventsAndRoles(int i);
	
}

