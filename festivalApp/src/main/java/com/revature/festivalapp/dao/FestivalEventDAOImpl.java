package com.revature.festivalapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.pojos.FestivalEvent;

public class FestivalEventDAOImpl implements FestivalEventDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public void updateFestivalEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(fe);
		tx.commit();
		sess.close();
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
	public void deleteFestivalEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(fe);
		tx.commit();
		sess.close();
	}
	
	@Override
	public FestivalEvent getFestivalEventById(int id) {
		Session sess = sf.openSession();
		FestivalEvent fe = (FestivalEvent) sess.get(FestivalEvent.class, id);
		sess.close();
		
		return fe;
	}

	@Override
	public List<FestivalEvent> getAllFestivalEvents() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(FestivalEvent.class);
		List<FestivalEvent> result = crit.list();
		sess.close();
		return result;
	}

}
