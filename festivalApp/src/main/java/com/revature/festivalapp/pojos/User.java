package com.revature.festivalapp.pojos;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User  {
	
	private int user_id;
	
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String email) {
		super();
		this.user_id = user_id;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
	