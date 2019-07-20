package com.revature.festivalapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.util.SessionFactoryUtil;

public class EventRoleDAOImpl implements EventRoleDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
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
		String hql = "from EventRole where id = :uId";
		Query q = sess.createQuery(hql);
		q.setInteger("uid", id);
		
		List<EventRole> er = q.list();
		sess.close();
		
		return er;
	}

}
