package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.Stage;

public interface StageDAO {

	public void updateStage(Stage stage);
	
	public void insertStage(Stage stage);
	
	public void deleteStage(Stage stage);
	
	//public Stage getStagebyName(Stage stagename); ??
	
	public Stage getStageById(int id);
	
	public List<Stage> getAllStages();

}
