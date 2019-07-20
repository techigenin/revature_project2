package com.revature.festival.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.FestivalEventDAOImpl;
import com.revature.festivalapp.pojos.FestivalEvent;

@Service
public class FestivalEventServicesImpl implements FestivalEventServices {

	private FestivalEventDAOImpl festivalEventDao;
	
	@Autowired
	public void setEventDao(FestivalEventDAOImpl festivalEventDao) {
		this.festivalEventDao = festivalEventDao;
	}

	@Override
	public void createFestivalEvent(FestivalEvent fe) {
			festivalEventDao.insertFestivalEvent(fe);

	}

	@Override
	public List<FestivalEvent> viewAllEvents() {
		// TODO Auto-generated method stub
		return  festivalEventDao.getAllFestivalEvents();
	}

	@Override
	public void updateFestivalEvent(FestivalEvent fe) {
		// TODO Auto-generated method stub
		festivalEventDao.updateFestivalEvent(fe);

	}

	@Override
	public void deleteFestivalEvent(FestivalEvent fe) {
		festivalEventDao.deleteFestivalEvent(fe);

	}

}
