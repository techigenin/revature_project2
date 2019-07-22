package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.EventRole;

public interface EventRoleService {
	
	public List<EventRole> getEventRolesByUserId(int i);

}
