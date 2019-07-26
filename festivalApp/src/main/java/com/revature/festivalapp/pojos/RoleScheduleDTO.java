package com.revature.festivalapp.pojos;

public class RoleScheduleDTO {
	
	private int eventNum;
	private String role;
	
	public RoleScheduleDTO() {
		super();
	}
	
	public RoleScheduleDTO(int eventNum, String role) {
		super();
		this.eventNum = eventNum;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "RoleScheduleDTO [eventNum=" + eventNum + ", role=" + role + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		RoleScheduleDTO other = (RoleScheduleDTO) obj;
		if (eventNum != other.eventNum)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	
	public int getEventNum() {
		return eventNum;
	}
	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
