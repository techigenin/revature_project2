package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;

public interface ManagerDAO extends UserDAO {
	
	public List<FestivalEvent> getFestivalEventsByManagerName(String m);

}
