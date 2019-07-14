package com.revature.festivalapp.pojos;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="manager")
@PrimaryKeyJoinColumn(name="id")
public class Manager extends User {
	
	@Column(name="manager_name")
	private String managerName;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int user_id, String email, String password, Set<String> collectedRoles) {
		super(user_id, email, password, collectedRoles);
		// TODO Auto-generated constructor stub
	}

	public Manager(String managerName) {
		super();
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getUser_id()=" + getUser_id() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getCollectedRoles()=" + getCollectedRoles() + ", getClass()=" + getClass() + "]";
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}
