package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public class FestivalEventDAOImpl implements FestivalEventDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public FestivalEvent getFestivalEventById(int id) {
		Session sess = sf.openSession();
		FestivalEvent fe = (FestivalEvent) sess.get(FestivalEvent.class, id);
		System.out.println(fe);
		sess.close();
		
		return fe;
	}
	
	
	@Override
	public void insertFestivalEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(fe);
		tx.commit();
		sess.close();
	}
	
	@Override
	public void updateFestivalEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(fe);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteFestivalEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(fe);
		tx.commit();
		sess.close();
	}
	

	@Override
	public List<FestivalEvent> getAllFestivalEvents() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(FestivalEvent.class);
		
		List<FestivalEvent> results = new ArrayList<FestivalEvent>();
		
		for (Object o : crit.list()) {
			if (o instanceof FestivalEvent)
				results.add((FestivalEvent)o);
		}	
		
		for (FestivalEvent fe : results) {
			System.out.println(fe);
		}
		sess.close();
		return results;
	}

	@Override
	public List<FestivalEvent> getAllFestivalEventsByManager(User u) throws IllegalArgumentException  {
		
		if (!u.isManager())
			throw new IllegalArgumentException();
		
		Session sess = sf.openSession();
		Criteria cr = sess.createCriteria(FestivalEvent.class);
		cr.add(Restrictions.eq("id", u.getId()));
		
		List<FestivalEvent> results = new ArrayList<FestivalEvent>();
		
		for (Object o : cr.list())
			if (o instanceof FestivalEvent)
				results.add((FestivalEvent)o);
		
		for (FestivalEvent fe : results) {
			System.out.println(fe);
		}
		
		sess.close();
		return results;
	}
}
