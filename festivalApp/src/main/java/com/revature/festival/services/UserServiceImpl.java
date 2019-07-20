package com.revature.festival.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.festivalapp.dao.UserDAOImpl;
import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.User;


public class UserServiceImpl implements UserServices {
		private UserDAOImpl userDao;
	
	
	@Autowired
	public void setUserDao(UserDAOImpl userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public User loginUser(String email, String password) {
		User user = null;
		for (User u: userDao.getAllUsers()){
			if (u.getEmail() == email && u.getPassword() == password)
							user = u;
							break;
		}
		
		return user;
	}

	@Override
	public void registerUser(User user) {
		userDao.insertUser(user);
	}

	

	
}
