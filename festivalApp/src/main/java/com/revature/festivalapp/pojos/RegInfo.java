package com.revature.festivalapp.pojos;

import javax.persistence.*;

@Entity
@Table(name="add_role")
public class RegInfo {

	@Id
	@Column(name="req_num")
	private int reqNum;
	
	@Column(name="role_type")
	private String roleType;
	
	@JoinColumn(name="event_num", referencedColumnName="event_number")
	private FestivalEvent event;
	
	@Column
	private boolean accepted;
	
	@Column
	private boolean valid;

	public RegInfo() {
		super();
	}

	public RegInfo(int reqNum, String roleType, FestivalEvent event, boolean accepted, boolean valid) {
		super();
		this.reqNum = reqNum;
		this.roleType = roleType;
		this.event = event;
		this.accepted = accepted;
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "AddRole [reqNum=" + reqNum + ", roleType=" + roleType + ", event=" + event + ", accepted=" + accepted
				+ ", valid=" + valid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accepted ? 1231 : 1237);
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + reqNum;
		result = prime * result + ((roleType == null) ? 0 : roleType.hashCode());
		result = prime * result + (valid ? 1231 : 1237);
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
		RegInfo other = (RegInfo) obj;
		if (accepted != other.accepted)
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (reqNum != other.reqNum)
			return false;
		if (roleType == null) {
			if (other.roleType != null)
				return false;
		} else if (!roleType.equals(other.roleType))
			return false;
		if (valid != other.valid)
			return false;
		return true;
	}

	public int getReqNum() {
		return reqNum;
	}

	public void setReqNum(int reqNum) {
		this.reqNum = reqNum;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public FestivalEvent getEvent() {
		return event;
	}

	public void setEvent(FestivalEvent event) {
		this.event = event;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
