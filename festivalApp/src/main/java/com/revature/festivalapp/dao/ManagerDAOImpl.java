package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.festivalapp.pojos.FestivalEvent;

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
}
