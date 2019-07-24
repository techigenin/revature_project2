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
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.util.SessionFactoryUtil;

@Component
public class StageDAOImpl implements StageDAO {
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public void updateStage(Stage stage) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(stage);
		tx.commit();
		sess.close();

	}

	@Override
	public void insertStage(Stage stage) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(stage);
		tx.commit();
		sess.close();

	}

	@Override
	public void deleteStage(Stage stage) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(stage);
		tx.commit();
		sess.close();

	}

	@Override
	public Stage getStageById(int id) {
		Session sess = sf.openSession();
		Stage stage = (Stage) sess.get(Stage.class, id);
		sess.close();
		return stage;
		
	}

	@Override
	public List<Stage> getAllStages() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Stage.class);
		List<Stage> result = crit.list();
		sess.close();
		return result;
		
	}

	@Override
	public Stage getStagebyName(String stageName) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Stage.class).add(Restrictions.eq("stageName", stageName));
		Stage stage = (Stage) crit.uniqueResult();
		sess.close();
		return stage;
	}

	@Override
	public List<Stage> getStagesByEvent(FestivalEvent fe) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Stage.class);
		crit.add(Restrictions.eq("festivalEvent", fe));
		
		List<Stage> retList = new ArrayList<Stage>();
		
		for (Object o : crit.list()) {
			retList.add((Stage)o);
		}
		
		for (Stage s : retList) {
			System.out.println(s.getCrew());
			System.out.println(s.getFestivalEvent());
		}
		sess.close();
		
		return retList;
	}

	@Override
	public void saveOrUpdateStage(Stage s) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.saveOrUpdate(s);
		tx.commit();
		sess.close();
	}
}
