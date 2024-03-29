package com.revature.festivalapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;

public interface ScheduleDAO {
	
	public void AddSchedule(Schedule schedule);
	public Schedule getSchedule(int i);
	public void UpdateSchedule(Schedule schedule);
	public void DeleteSchedule(Schedule sch);// Delete by ID
	
	public List<Schedule> ViewAllSchedule();
	public List<Schedule> SearchByName (String artist_name);// by artist name incase we gonna use it later 

	
}
