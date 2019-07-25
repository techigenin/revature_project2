package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;
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
	public List<Schedule> getScheudlesByUser(User user) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Schedule.class);
		crit.add(Restrictions.eq("user_id", user));
		
		List<Schedule> sch = new ArrayList<>();
		
		for (Object o : crit.list())
			if (o instanceof Schedule)
			sch.add((Schedule)o);
		
		for (Schedule s : sch )
			System.out.println(s);
		
		sess.close();
		
		return sch;
	}

}
