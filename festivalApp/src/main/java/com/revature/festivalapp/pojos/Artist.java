package com.revature.festivalapp.pojos;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="artist")
@PrimaryKeyJoinColumn(name="id")
public class Artist extends User {
	
	@Column(name="artist_name")
	private String artistName;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(int user_id, String email, String password, Set<String> collectedRoles) {
		super(user_id, email, password, collectedRoles);
		// TODO Auto-generated constructor stub
	}

	public Artist(String artistName) {
		super();
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "Artist [artistName=" + artistName + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getUser_id()=" + getUser_id() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getCollectedRoles()=" + getCollectedRoles() + ", getClass()=" + getClass() + "]";
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	
}
