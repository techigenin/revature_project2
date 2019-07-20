package com.revature.festivalapp.services;

import java.util.Collection;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;

public interface UserService {
	
	public User loginUser(User u);
	
	public User saveUser(User u);

	public Collection<? extends Schedule> getAllUserEventsAndRoles();
	
}

