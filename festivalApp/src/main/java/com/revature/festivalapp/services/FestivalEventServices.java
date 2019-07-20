package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;

public interface FestivalEventServices {

	public void createFestivalEvent(FestivalEvent fe);
	
	public List<FestivalEvent> viewAllEvents();
	
	public void updateFestivalEvent(FestivalEvent fe);
	
	public void deleteFestivalEvent(FestivalEvent fe);
}
