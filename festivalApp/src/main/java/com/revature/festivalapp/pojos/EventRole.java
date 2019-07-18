package com.revature.festivalapp.pojos;

import javax.persistence.*;

@Entity
@Table(name="event_role")
public class EventRole {
	
	@EmbeddedId
	private EventRoleEmbedded idEventId;
	
	@Column(name="user_role")
	private String userRole;

	public EventRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventRole(EventRoleEmbedded id, String userRole) {
		super();
		this.idEventId = id;
		this.userRole = userRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventId == null) ? 0 : idEventId.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
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
		EventRole other = (EventRole) obj;
		if (idEventId == null) {
			if (other.idEventId != null)
				return false;
		} else if (!idEventId.equals(other.idEventId))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EventRole [id=" + idEventId + ", userRole=" + userRole + "]";
	}

	public EventRoleEmbedded getIdEventId() {
		return idEventId;
	}

	public void setIdEventId(EventRoleEmbedded val) {
		this.idEventId = val;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
