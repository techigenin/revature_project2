package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;

public interface FestivalEventDAO {
	
	public void updateFestivalEvent(FestivalEvent fe);
	
	public void insertFestivalEvent(FestivalEvent fe);
	
	public void deleteFestivalEvent(FestivalEvent fe);
	
	public FestivalEvent getFestivalEventById(int id);
	
	public List<FestivalEvent> getAllFestivalEvents();
	
	public List<FestivalEvent> getAllFestivalEventsByManager(User u);

}
