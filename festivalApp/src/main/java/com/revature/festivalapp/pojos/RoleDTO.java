package com.revature.festivalapp.pojos;

public class RoleDTO {
	
	private String email;
	private String role;
	private int eventNum;
	
	
	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RoleDTO(String email, String role, int eventNum) {
		super();
		this.email = email;
		this.role = role;
		this.eventNum = eventNum;
	}


	@Override
	public String toString() {
		return "RoleDTO [email=" + email + ", role=" + role + ", eventNum=" + eventNum + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + eventNum;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleDTO other = (RoleDTO) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (eventNum != other.eventNum)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getEventNum() {
		return eventNum;
	}


	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
	}
	
	
	

}



