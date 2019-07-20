package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.EventRole;

public interface EventRoleDAO {
	
	public void insertEventRole(EventRole er);
	public void updateEventRole(EventRole er);
	public void deleteEventRole(EventRole er);
	public List<EventRole> getAllEventRoles();
	public List<EventRole> getAllEventRolesByUserId(int i);

}
