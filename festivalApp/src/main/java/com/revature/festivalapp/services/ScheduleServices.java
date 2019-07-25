package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;

public interface ScheduleServices {
	
	public void createSchedule(Schedule schedule);
	
	public List<Schedule> viewAllSchedules();
	
	public void updateSchedule(Schedule schedule);
	
	public void deleteSchedule(Schedule schedule);

	public List<Schedule> getSchedulesByStage(Stage s);
	
	public List<Schedule> getScheduleByUsers(User user);
	
	public List<Schedule> getArtistStageSchedules(Stage s, User artist);
}
