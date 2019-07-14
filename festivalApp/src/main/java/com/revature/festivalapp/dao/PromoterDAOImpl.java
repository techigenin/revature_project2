package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;

public class PromoterDAOImpl extends UserDAOImpl implements PromoterDAO {

	@Override
	public List<FestivalEvent> getFestivalEventsByPromoterName(String name) {
		Session sess = sf.openSession();
	
		// Get all events the user has a role in.
		Criteria crit = sess.createCriteria(EventRole.class);
		crit.add(Restrictions.eq("id", getIdByName(name)));
		
		List<EventRole> roles = new ArrayList<EventRole>();
		
		for (Object o : crit.list())
			if (o instanceof EventRole)
				roles.add((EventRole)o);
		
		List<Integer> eventNums = new ArrayList<Integer>();
		
		for (EventRole e : roles)
			if (e.getUserRole().toLowerCase().contains("promoter"))
				eventNums.add(e.getIdEventId().getEventId());
		
		List<FestivalEvent> results = new ArrayList<FestivalEvent>();
		
		crit = sess.createCriteria(FestivalEvent.class);
		crit.add(Restrictions.in("event_number", eventNums));
		
		for(Object o : crit.list())
			if (o instanceof FestivalEvent)
				results.add((FestivalEvent)o);
		
		return results;
	}

	private int getIdByName(String name) {
		Session sess = sf.openSession();
		String hql = "select id from promoter where promoter_name = :name";
		Query query = sess.createQuery(hql);
		query.setString("name", name);
		
		return (int) query.uniqueResult();
	}

}
