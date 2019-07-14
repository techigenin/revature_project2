package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.FestivalEvent;

public interface ArtistDAO extends UserDAO {
	
	public List<FestivalEvent> getFestivalEventByArtistName(String name);

}
