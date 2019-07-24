package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Stage;

public interface StageDAO {

	public void updateStage(Stage stage);
	
	public void insertStage(Stage stage);
	
	public void deleteStage(Stage stage);
	
	public Stage getStagebyName(String stageName);
	
	public Stage getStageById(int id);
	
	public List<Stage> getAllStages();
	
	public List<Stage> getStagesByEvent(FestivalEvent fe);

}
