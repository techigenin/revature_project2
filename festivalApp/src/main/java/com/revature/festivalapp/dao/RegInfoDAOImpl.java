package com.revature.festivalapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.springframework.stereotype.Component;

import com.revature.festivalapp.pojos.RegInfo;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public class RegInfoDAOImpl implements RegInfoDAO {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public void insertRegInfo(RegInfo a) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(a);
		tx.commit();
		sess.close();
	}

	@Override
	public RegInfo getRegInfo(int i) {
		Session sess = sf.openSession();
		RegInfo rf = (RegInfo) sess.get(RegInfo.class, i);
		sess.close();
		return rf;
	}

	@Override
	public List<RegInfo> getAllRegInfo() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(RegInfo.class);
		
		List<RegInfo> regList = new ArrayList<RegInfo>();
		
		for (Object o : crit.list())
			if (o instanceof RegInfo)
				regList.add((RegInfo)o);
		
		sess.close();
		
		return regList;
	}

	@Override
	public void updateRegInfo(RegInfo a) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(a);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteRegInfo(RegInfo a) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(a);
		tx.commit();
		sess.close();
	}

}
