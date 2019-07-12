package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;

public interface FestivalEventDao {
	
	public void updateFestivalEvant(FestivalEvent fe);
	
	public void insertFestivalEvent(FestivalEvent fe);
	
	public void deleteFestivalEvent(FestivalEvent fe);
	
	public FestivalEvent getFestivalEventById(int id);
	
	public List<FestivalEvent> getAllFestivalEvents();

}
