package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;

public interface PromoterDAO extends UserDAO {
	
	public List<FestivalEvent> getFestivalEventsByPromoterName(String name);

}
