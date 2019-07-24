package com.revature.festivalapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.ScheduleDAO;
import com.revature.festivalapp.dao.ScheduleDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;

@Service
public class ScheduleServicesImpl implements ScheduleServices {
	private ScheduleDAO scheduleDAO ;
	
	
	
	@Autowired
	public void setScheduleDAO(ScheduleDAO scheduleDAO) {
		this.scheduleDAO = scheduleDAO;	
	}
	
	@Override
	public void createSchedule(Schedule schedule) {
		scheduleDAO.AddSchedule(schedule);
	}

	@Override
	public List<Schedule> viewAllSchedules() {
		// TODO Auto-generated method stub
		return scheduleDAO.ViewAllSchedule();
	}

	@Override
	public void updateSchedule(Schedule schedule) {
		scheduleDAO.UpdateSchedule(schedule);
		
	}

	@Override
	public void deleteSchedule(Schedule schedule) {
			scheduleDAO.DeleteSchedule(schedule);
	}

	@Override
	public List<Schedule> getSchedulesByStage(Stage s) {
		return scheduleDAO.getSchedulesByStage(s);
	}

	@Override
	public void SaveOrUpdate(Schedule schedule) {
		scheduleDAO.SaveOrUpdate(schedule);
	}

}
