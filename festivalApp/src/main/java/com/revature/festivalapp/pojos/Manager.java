package com.revature.festivalapp.pojos;

public class Manager extends User {
	private String managerName;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String managerEmail, String managerName) {
		super(managerEmail);
		this.managerName = managerName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}
