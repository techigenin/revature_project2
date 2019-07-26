package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;

public interface ScheduleDAO {
	
	public void AddSchedule(Schedule schedule);
	public Schedule getSchedule(int i);
	public void UpdateSchedule(Schedule schedule);
	public void DeleteSchedule(Schedule sch);// Delete by ID
	
	public List<Schedule> ViewAllSchedule();
	public List<Schedule> SearchByName (String artist_name);// by artist name incase we gonna use it later 
	public List<Schedule> getSchedulesByStage(Stage s);
	public List<Schedule> getScheudlesByUser(User user);
	public List<Schedule> getArtistStageSchedules(Stage s, User artist);
	public void saveOrUpdate(Schedule schedule);
}
