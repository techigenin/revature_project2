package com.revature.festivalapp.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public interface ScheduleDAOImpl  {
		
		public void AddSchedule(Schedule schedule);
		public Schedule getSchedule(int i);
		public void UpdateSchedule(Schedule schedule);
		public void DeleteSchedule(Schedule sch);// Delete by ID

		public List<Schedule> ViewAllSchedule();
		public List<Schedule> SearchByName (String artist_name);// by artist name incase we gonna use it later 
		public List<Schedule> getSchedulesByStage(Stage s);

}
