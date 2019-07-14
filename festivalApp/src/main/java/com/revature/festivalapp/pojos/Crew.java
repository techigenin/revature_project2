package com.revature.festivalapp.pojos;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="crew")
@PrimaryKeyJoinColumn(name="id")
public class Crew extends User {

	public Crew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crew(int user_id, String email, String password, Set<String> collectedRoles) {
		super(user_id, email, password, collectedRoles);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Crew [toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getUser_id()=" + getUser_id()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getCollectedRoles()="
				+ getCollectedRoles() + ", getClass()=" + getClass() + "]";
	}
}
