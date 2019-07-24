package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;

public interface EventRoleDAO {
	
	public EventRole getEventRole(int i);
	public void insertEventRole(EventRole er);
	public void updateEventRole(EventRole er);
	public void deleteEventRole(EventRole er);
	public List<EventRole> getAllEventRoles();
	public List<EventRole> getAllEventRolesByUser(User u);
	public List<EventRole> getAllEventRolesByEvent(FestivalEvent fe);

}
