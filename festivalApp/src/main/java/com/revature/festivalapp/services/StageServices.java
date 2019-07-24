package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;

public interface StageServices {
	
	public Stage getStage(int i);
	
	public void createStage(Stage stage);
	
	public void updateStage(Stage stage);
	
	public List <Stage> viewAllStages();
	
	public void deleteStage(Stage stage);
	
	public List<Stage> getStagesByEvent(FestivalEvent fe);
	
	public void SaveOrUpdateStage(Stage stage);

}
