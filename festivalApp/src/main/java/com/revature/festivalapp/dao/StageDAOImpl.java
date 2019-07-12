package com.revature.festivalapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.festival.util.SessionFactoryUtil;
import com.revature.festivalapp.pojos.Stage;

public class StageDAOImpl implements StageDAO {
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public void updateStage(Stage stage) {
		Session sess = sf.openSession();
		sess.update(stage);
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
		sess.delete(stage);
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

	public Stage getStagebyName(String stagename) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Stage.class).add(Restrictions.eq("stage_name", stagename));
		Stage stage = (Stage) crit.uniqueResult();
		
		return stage;
	}
}
