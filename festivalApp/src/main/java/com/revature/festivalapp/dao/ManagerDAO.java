package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Manager;

public interface ManagerDAO extends UserDAO {
	
	public List<FestivalEvent> getFestivalEventsByManagerName(String m);
	
	public void insertManager(Manager m);
	
	public void updateManager(Manager m);
	
	public void deleteManager(Manager m);
	
	public Manager getManagerByEmail(String e);
	
	public List<Manager> getAllManagers();

}
