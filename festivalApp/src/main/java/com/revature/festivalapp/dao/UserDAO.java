package com.revature.festivalapp.dao;

import java.util.List;


import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;

public interface UserDAO {
	
	public User getUser(int id);
	
	public User getUserByEmail(String email);
	
	public void updateUser(User u);
	
	public void insertUser(User u);
	
	public void deleteUser(User u);
	
	public List<User> getAllUsers();
	
	public List<FestivalEvent> getFestivalEventsByUserId(int id);
}
