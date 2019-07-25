package com.revature.festivalapp.pojos;

import javax.persistence.*;

@Entity
@Table(name="add_role")
public class RegInfo {

	@Id
	@Column(name="req_num")
	private long reqNum;
	
	@Column(name="role_type")
	private String roleType;
	
	@ManyToOne
	@JoinColumn(name="event_num", referencedColumnName="event_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private FestivalEvent event;
	
	@Column
	private Boolean accepted;
	
	@Column
	private Boolean valid;

	public RegInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegInfo(long reqNum, String roleType, FestivalEvent event, Boolean accepted, Boolean valid) {
		super();
		this.reqNum = reqNum;
		this.roleType = roleType;
		this.event = event;
		this.accepted = accepted;
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "RegInfo [reqNum=" + reqNum + ", roleType=" + roleType + ", event=" + event + ", accepted=" + accepted
				+ ", valid=" + valid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accepted == null) ? 0 : accepted.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + (int) (reqNum ^ (reqNum >>> 32));
		result = prime * result + ((roleType == null) ? 0 : roleType.hashCode());
		result = prime * result + ((valid == null) ? 0 : valid.hashCode());
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
		if (accepted == null) {
			if (other.accepted != null)
				return false;
		} else if (!accepted.equals(other.accepted))
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
		if (valid == null) {
			if (other.valid != null)
				return false;
		} else if (!valid.equals(other.valid))
			return false;
		return true;
	}

	public long getReqNum() {
		return reqNum;
	}

	public void setReqNum(long reqNum) {
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

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	
}