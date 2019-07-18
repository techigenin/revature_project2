package com.revature.festivalapp.dao;

import static org.hibernate.criterion.Restrictions.eq;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.pojos.Schedule;


public class ScheduleDAO implements ScheduleDAOImpl {
	public static SessionFactory sf=SessionFactoryUtil.getSessionFactory();
	
	
	@Override
	public void DeleteSchedule(int stage_number,String artist_name) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();

		String hql = "Delete from Schedule  where artistName  = :artist_name and stageNumber =:stage_number ";
		Query query = sess.createQuery(hql);
		query.setParameter("type", stage_number);
		query.setParameter("type", artist_name);

		query.executeUpdate();
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
		Criteria crit = sess.createCriteria(Schedule.class).add(eq("artistName", artist_name));
		List<Schedule> result = crit.list();
		sess.close();
		return result;
	}

}
