package com.revature.festivalapp.pojos;

public class Artist extends User {
	
	
	private String artistName;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Artist(int user_id, String email) {
		super(user_id, email);
		// TODO Auto-generated constructor stub
	}



	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
}
