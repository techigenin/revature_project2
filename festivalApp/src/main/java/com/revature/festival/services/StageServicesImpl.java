package com.revature.festival.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.StageDAOImpl;
import com.revature.festivalapp.pojos.Stage;

@Service
public class StageServicesImpl implements StageServices {
	
	private StageDAOImpl stageDao;
	
	@Autowired
	public void setStageDao(StageDAOImpl stageDao) {
		this.stageDao = stageDao;
	}

	@Override
	public void createStage(Stage stage) {
		stageDao.insertStage(stage);

	}

	@Override
	public void updateStage(Stage stage) {
		stageDao.updateStage(stage);

	}

	@Override
	public List<Stage> viewAllStages() {
		// TODO Auto-generated method stub
		return stageDao.getAllStages();
	}

	@Override
	public void deleteStage(Stage stage) {
		stageDao.deleteStage(stage);

	}

}
