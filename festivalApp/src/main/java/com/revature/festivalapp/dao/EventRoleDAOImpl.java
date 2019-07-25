package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public class EventRoleDAOImpl implements EventRoleDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public EventRole getEventRole(int i) {
		Session sess = sf.openSession();
		EventRole er = (EventRole)sess.get(EventRole.class, i);
		
		sess.close();
		return er;
	}
	
	@Override
	public void insertEventRole(EventRole er) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(er);
		tx.commit();
		sess.close();
	}

	@Override
	public void updateEventRole(EventRole er) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(er);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteEventRole(EventRole er) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(er);
		tx.commit();
		sess.close();
	}

	@Override
	public List<EventRole> getAllEventRoles() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(EventRole.class);
		
		List<EventRole> er = crit.list();
		
		for (EventRole e : er)
			System.out.println(e);
		sess.close();
		
		return er;
	}

	@Override
	public List<EventRole> getAllEventRolesByUser(User u) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(EventRole.class);
		crit.add(Restrictions.eq("user", u));
		
		List<EventRole> er = new ArrayList<>();
		
		for (Object o : crit.list())
			if (o instanceof EventRole)
				er.add((EventRole)o);
		
		for (EventRole e : er)
			System.out.println(e);
		
		sess.close();
		
		return er;
	}

	@Override
	public List<EventRole> getAllEventRolesByEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(EventRole.class);
		crit.add(Restrictions.eq("event", fe));
		
		List<EventRole> er = new ArrayList<>();
		
		for (EventRole e : er)
			System.out.println(e);
		
		for (Object o : crit.list())
			er.add((EventRole)o);
		sess.close();
		
		return er;
	}

}
