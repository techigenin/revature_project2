//package com.revature.festivalapp.pojos;
//
//import java.util.Set;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="manager")
//@PrimaryKeyJoinColumn(name="id")
//public class Manager extends User {
//	
//	@Column(name="manager_name")
//	private String managerName;
//
//	public Manager() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Manager(String managerName) {
//		super();
//		this.managerName = managerName;
//	}
//	
//	public Manager(String managerName, String email, String password, String collectedRoles) {
//		super(email, password, collectedRoles);
//		this.managerName = managerName; 
//	}
//
//	@Override
//	public String toString() {
//		return "Manager [managerName=" + managerName + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
//				+ ", getCollectedRoles()=" + getCollectedRoles() + "]";
//	}
//
//	public String getManagerName() {
//		return managerName;
//	}
//
//	public void setManagerName(String managerName) {
//		this.managerName = managerName;
//	}
//
//	
//}
