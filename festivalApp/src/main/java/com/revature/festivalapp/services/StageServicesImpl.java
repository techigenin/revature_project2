package com.revature.festivalapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.StageDAO;
import com.revature.festivalapp.dao.StageDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Stage;

@Service
public class StageServicesImpl implements StageServices {
	
	private StageDAO stageDAO = new StageDAOImpl();
	
	public StageDAO getStageDAO() {
		return stageDAO;
	}

	@Autowired
	public void setStageDAO(StageDAO stageDAO) {
		this.stageDAO = stageDAO;
	}

	@Override
	public void createStage(Stage stage) {
		stageDAO.insertStage(stage);

	}

	@Override
	public void updateStage(Stage stage) {
		stageDAO.updateStage(stage);

	}
	
	@Override
	public void saveOrUpdateStage(Stage s) {
		stageDAO.saveOrUpdateStage(s);
	}

	@Override
	public List<Stage> viewAllStages() {
		return stageDAO.getAllStages();
	}

	@Override
	public void deleteStage(Stage stage) {
		stageDAO.deleteStage(stage);

	}

	@Override
	public List<Stage> getStagesByEvent(FestivalEvent fe) {
		return stageDAO.getStagesByEvent(fe);
	}

	@Override
	public Stage getStage(int i) {
		return stageDAO.getStageById(i);
	}

}
