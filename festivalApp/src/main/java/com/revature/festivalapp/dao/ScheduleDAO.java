package com.revature.festivalapp.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.ScheduleEmbedded;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public class ScheduleDAO implements ScheduleDAOImpl {
	
	public static SessionFactory sf=SessionFactoryUtil.getSessionFactory();
		
	@Override
	public Schedule getSchedule(int i) {
		Session sess = sf.openSession();
		Schedule sch = (Schedule) sess.get(Schedule.class, i);
		sess.close();
		return sch;
	}

	
	@Override
	public void AddSchedule(Schedule schedule) {
		
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(schedule);
		tx.commit();
		sess.close();
	}
		
	@Override
	public void UpdateSchedule(Schedule schedule) {
	
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		sess.update(schedule);
		tx.commit();
		sess.close();
	}
	
	@Override
	public void DeleteSchedule(Schedule sch) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(sch);
		tx.commit();
		sess.close();
	}

	@Override
	public List<Schedule> ViewAllSchedule() {
		
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		Criteria crit = sess.createCriteria(Schedule.class);
		List<Schedule> result = crit.list();
			
		for(Object o : crit.list())
				if(o instanceof Schedule)
					result.add((Schedule)o);
							
		tx.commit();
		sess.close();
		return result;
	}
	
	@Override
	public List<Schedule> SearchByName(String artist_name) {
		Session sess = sf.openSession();
		//Criteria crit = sess.createCriteria(Schedule.class).add(eq("artistName", artist_name));
		String hql="from Schedule where artistNname =: artist_name ";		
		Query query = sess.createQuery(hql);
		query.setParameter("artist_name", artist_name);
		List<Schedule> result = query.list();
		sess.close();
		return result;
	}


	@Override
	public List<Schedule> getSchedulesByStage(Stage s) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Schedule.class);
		crit.add(Restrictions.eq("stageNumber", s));
		
		List<Schedule> retList = new ArrayList<Schedule>();
		
		for (Object o : crit.list())
			retList.add((Schedule)o);
		
		for (Schedule sch : retList)
			System.out.println(sch);
		
		sess.close();
		
		return retList;
	}


	@Override
	public void SaveOrUpdate(Schedule schedule) {
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		sess.saveOrUpdate(schedule);
		tx.commit();
		sess.close();
		
	}



}
