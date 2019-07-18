package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.Schedule;

public interface ScheduleDAOImpl {
	
	public void DeleteSchedule(int stage_number , String artist_name);// Delete by ID
	public void AddSchedule(Schedule schedule);
	public List<Schedule> ViewAllSchedule();
	public void UpdateSchedule(Schedule schedule);
	public List<Schedule> SearchByName (String artist_name);// by artist name incase we gonna use it later 

	
}
