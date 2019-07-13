package com.revature.festivalapp.pojos;

public class Artist extends User {
	
	
	private String artistName;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(String email) {
		super(email);
		// TODO Auto-generated constructor stub
	}

	public Artist(String email, String artistName) {
		super(email);
		this.artistName = artistName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
}
