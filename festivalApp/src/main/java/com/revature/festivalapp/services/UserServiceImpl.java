package com.revature.festivalapp.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.dao.EventRoleDAO;
import com.revature.festivalapp.dao.EventRoleDAOImpl;
import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;

@Component
public class UserServiceImpl implements UserService {

	UserDAO userDAO = new UserDAOImpl();
	EventRoleDAO eventRoleDao = new EventRoleDAOImpl();
	
	@Autowired // TODO - Why isn't this working..?
	void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
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

	UserDAO getUserDAO() {
		return userDAO;
	}

	@Override
	public List<EventRole> getAllUserEventsAndRoles(int id) {
		return eventRoleDao.getAllEventRolesByUserId(id);
	}


		
}
