package com.revature.festivalapp.pojos;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
	private String email;

	public User(String email) {
		super();
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
