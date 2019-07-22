package com.revature.festivalapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.EventRoleDAO;
import com.revature.festivalapp.pojos.EventRole;


@Service
public class EventRoleServiceImpl implements EventRoleService {

	EventRoleDAO eventRoleDAO;
	
	EventRoleDAO getEventRoleDAO() {
		return eventRoleDAO;
	}

	@Autowired
	void setEventRoleDAO(EventRoleDAO eventRoleDAO) {
		this.eventRoleDAO = eventRoleDAO;
	}

	@Override
	public List<EventRole> getEventRolesByUserId(int i) {
		return eventRoleDAO.getAllEventRolesByUserId(i);
	}
}
