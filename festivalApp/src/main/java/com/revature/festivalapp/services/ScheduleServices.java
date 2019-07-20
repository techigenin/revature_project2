package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.Schedule;

public interface ScheduleServices {
	
	public void createSchedule(Schedule schedule);
	
	public List<Schedule> viewAllSchedules();
	
	public void updateSchedule(Schedule schedule);
	
	public void deleteSchedule(Schedule schedule);
	
	

}
