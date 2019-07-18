 package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.User;

public class UserDAOImpl implements UserDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public User getUser(int id) throws IllegalArgumentException {
		
		if (id < 1)
			throw new IllegalArgumentException();
		
		Session sess = sf.openSession();
		User u = (User)sess.get(User.class, id);
		sess.close();
		
		return u;
	}
	
	public User getUserByEmail(String email) {
		Session sess = sf.openSession();
//		Criteria crit = sess.createCriteria(User.class);		
//		crit.add(Restrictions.eq("val_email", email));
		
		String hql = "from User where val_email = :eml";
		Query q = sess.createQuery(hql);
		q.setString("eml", email);
		
		User u = (User) q.uniqueResult();
		
		sess.close();
		
		return u;
	}
	
	@Override
	public void insertUser(User u) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(u);
		tx.commit();
		sess.close();
	}
	
	@Override
	public void updateUser(User u) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(u);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteUser(User u) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(u);
		tx.commit();
		sess.close();
	}

	@Override
	public List<User> getAllUsers() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(User.class);
		
		List<User> results = new ArrayList<>();
		
		for (Object o : crit.list())
			if (o instanceof User)
				results.add((User)o);
		
		sess.close();	
		return results;
	}
	
	@Override
	public List<FestivalEvent> getFestivalEventsByUserId(int id) {
		Session sess = sf.openSession();
		List<FestivalEvent> results = new ArrayList<>();
		
		String hql = "from event_role where id = :idVal";
		Query q = sess.createQuery(hql);
		q.setParameter("idVal", id);
		
		for (Object o : q.list())
			if (o instanceof FestivalEvent)
				results.add((FestivalEvent)o);
		
		sess.close();	
		return results;
	}

}
