package com.revature.festivalapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.EventRole;
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
		sess.close();
		
		return er;
	}

	@Override
	public List<EventRole> getAllEventRolesByUserId(int id) {
		Session sess = sf.openSession();
		String hql = "from EventRole where userId = :uId";
		Query q = sess.createQuery(hql);
		q.setInteger("uId", id);
		
		List<EventRole> er = q.list();
		sess.close();
		
		return er;
	}

}
