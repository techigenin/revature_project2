package com.revature.festival.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.ScheduleDAOImpl;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.User;

@Service
public class ScheduleServicesImpl implements ScheduleServices {
	private ScheduleDAOImpl scheduleDao;
	private User user;
	
	@Autowired
	public void setScheduleDAO(ScheduleDAOImpl scheduleDao) {
		this.scheduleDao = scheduleDao;
		
	}
	
	@Autowired
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public void createSchedule(Schedule schedule) {
		scheduleDao.AddSchedule(schedule);
		
		
	}

	@Override
	public List<Schedule> viewAllSchedules() {
		// TODO Auto-generated method stub
		return scheduleDao.ViewAllSchedule();
	}

	@Override
	public void updateSchedule(Schedule schedule) {
		scheduleDao.UpdateSchedule(schedule);
		
	}

	@Override
	public void deleteSchedule(Schedule schedule) {
			scheduleDao.DeleteSchedule(schedule);
	}

	@Override
	public User addArtistToSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return null;
	}




}
