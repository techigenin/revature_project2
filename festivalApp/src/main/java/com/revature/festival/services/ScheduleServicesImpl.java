package com.revature.festival.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.ScheduleDAOImpl;
import com.revature.festivalapp.pojos.Schedule;

@Service
public class ScheduleServicesImpl implements ScheduleServices {
	private ScheduleDAOImpl scheduleDao;
	
	@Autowired
	public void setScheduleDAO(ScheduleDAOImpl scheduleDao) {
		this.scheduleDao = scheduleDao;
		
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


}
