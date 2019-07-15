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

}
