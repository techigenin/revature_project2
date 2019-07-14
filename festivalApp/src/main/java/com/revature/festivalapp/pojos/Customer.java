package com.revature.festivalapp.pojos;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="customer")
@PrimaryKeyJoinColumn(name="id")
public class Customer extends User {

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int user_id, String email, String password, Set<String> collectedRoles) {
		super(user_id, email, password, collectedRoles);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getUser_id()="
				+ getUser_id() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getCollectedRoles()=" + getCollectedRoles() + ", getClass()=" + getClass() + "]";
	}


}
