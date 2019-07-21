package com.revature.festivalapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.dao.EventRoleDAO;
import com.revature.festivalapp.dao.EventRoleDAOImpl;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.User;

@Component
public class UserServiceImpl implements UserService {

	UserDAO userDAO;
	EventRoleDAO eventRoleDAO;

	UserDAO getUserDAO() {
		return userDAO;
	}

	EventRoleDAO getEventRoleDAO() {
		return eventRoleDAO;
	}

	void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	void setEventRoleDAO(EventRoleDAO eventRoleDAO) {
		this.eventRoleDAO = eventRoleDAO;
	}

	@Override
	public User loginUser(User u) {	
		User knownUser = userDAO.getUserByEmail(u.getEmail());

		if (knownUser != null && u.getPassword().equals(knownUser.getPassword()))
			return knownUser;
		
		return null;
	}
	
	@Override
	public void registerUser(User user) {
		userDAO.insertUser(user);
	}
	
	@Override
	public List<EventRole> getAllUserEventsAndRoles(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
