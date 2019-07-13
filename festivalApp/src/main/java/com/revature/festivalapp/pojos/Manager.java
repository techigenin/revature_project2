package com.revature.festivalapp.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager extends User {
	
	@Column(name="manager_name")
	private String managerName;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getManagerName() {
		return managerName;
	}
	public Manager(int user_id, String email) {
		super(user_id, email);
		// TODO Auto-generated constructor stub
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}
