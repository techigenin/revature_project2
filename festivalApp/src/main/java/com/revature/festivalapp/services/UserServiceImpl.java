package com.revature.festivalapp.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.dao.UserDAO;
import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;

@Component
public class UserServiceImpl implements UserService {

	UserDAO userDAO = new UserDAOImpl();
	
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
	public User saveUser(User u) {
		return null;
	}

	UserDAO getUserDAO() {
		return userDAO;
	}

	@Override
	public Collection<? extends Schedule> getAllUserEventsAndRoles() {
		// TODO Auto-generated method stub
		return null;
	}


		
}
