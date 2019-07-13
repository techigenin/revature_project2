package com.revature.festivalapp.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="crew")
public class Crew extends User {

	public Crew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crew(int user_id, String email) {
		super(user_id, email);
		// TODO Auto-generated constructor stub
	}



}
