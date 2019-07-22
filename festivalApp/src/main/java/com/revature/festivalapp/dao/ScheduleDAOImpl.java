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
public class ScheduleDAOImpl implements ScheduleDAO {
	
	public static SessionFactory sf=SessionFactoryUtil.getSessionFactory();
	
	@Override
	public void DeleteSchedule(Schedule sch) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(sch);
		tx.commit();
		sess.close();
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
	public List<Schedule> ViewAllSchedule() {
		
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		Criteria crit = sess.createCriteria(Schedule.class);
		List<Schedule> result = crit.list();
	
		tx.commit();
		sess.close();
		return result;
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
	public Schedule getSchedule(int i) {
		Session sess = sf.openSession();
		Schedule sch = (Schedule) sess.get(Schedule.class, i);
		sess.close();
		return sch;
	}

	@Override
	public List<Schedule> getSchedulesbyEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Schedule.class);
		crit.add(Restrictions.eq("event", fe));
		
		List<Schedule> retList = new ArrayList<Schedule>();
		
		for (Object o : crit.list())
			retList.add((Schedule)o);
		
		sess.close();
		
		return retList;
	}

}
