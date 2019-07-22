package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;

public interface EventRoleService {
	
	public List<EventRole> getEventRolesByUser(User u);

	public List<EventRole> getEventRolesbyEvent(FestivalEvent fe);


}
