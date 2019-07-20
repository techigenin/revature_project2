package com.revature.festival.services;

import java.util.List;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;

public interface ScheduleServices {
	
	public void createSchedule(Schedule schedule);
	
	public List<Schedule> viewAllSchedules();
	
	public void updateSchedule(Schedule schedule);
	
	public void deleteSchedule(Schedule schedule);
	
	public User addArtistToSchedule(Schedule schedule);

}
