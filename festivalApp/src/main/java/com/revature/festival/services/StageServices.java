package com.revature.festival.services;

import java.util.List;

import com.revature.festivalapp.pojos.Stage;

public interface StageServices {
	
	public void createStage(Stage stage);
	
	public void updateStage(Stage stage);
	
	public List <Stage> viewAllStages();
	
	public void deleteStage(Stage stage);
	
	

}
