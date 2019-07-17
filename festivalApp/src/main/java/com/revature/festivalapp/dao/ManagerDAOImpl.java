package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Manager;

public class ManagerDAOImpl extends UserDAOImpl implements ManagerDAO {

	@Override
	public List<FestivalEvent> getFestivalEventsByManagerName(String m) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(FestivalEvent.class);
		crit.add(Restrictions.eq("manager_id", getIdByName(m)));
		
		List<FestivalEvent> results= new ArrayList<FestivalEvent>();
		
		for (Object o: crit.list())
			if (o instanceof FestivalEvent)
				results.add((FestivalEvent)o);
		
		sess.close();
		return results;
	}
	
	private int getIdByName(String mName) {
		Session sess = sf.openSession();
		String hql = "select id from manager where manager_name = :mName";
		Query query = sess.createQuery(hql);
		query.setString("mName", mName);
		
		return (int) query.uniqueResult();
	}

	@Override
	public void updateManager(Manager m) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(m);
		tx.commit();
		sess.close();
	}
	
	@Override
	public void insertManager(Manager m) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(m);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteManager(Manager m) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(m);
		tx.commit();
		sess.close();
	}

	@Override
	public Manager getManagerByEmail(String em) {
		Session sess = sf.openSession();
//		Criteria crit = sess.createCriteria(Manager.class);
//		crit.add(Restrictions.eq("val_email", em));
//		
//		List<Manager> m = (List<Manager>)crit.list();
//		sess.close();
		
		String hql = "from Manager where val_email = :eml";
		Query q = sess.createQuery(hql);
		q.setString("eml", em);
		
		Manager m = (Manager)q.uniqueResult();
		
		sess.close();
		
		return m;
	}

	@Override
	public List<Manager> getAllManagers() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Manager.class);

		List<Manager> results = new ArrayList<Manager>();
		
		for (Object o : crit.list())
			if (o instanceof Manager)
				results.add((Manager)o);
		
		sess.close();
		return results;
	}

	@Override
	public Manager getManagerById(int id) {
		Session sess = sf.openSession();
		Manager m = (Manager)sess.get(Manager.class, id);
		sess.close();
		
		return m;
	}
}
