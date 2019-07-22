package com.revature.festivalapp.pojos;

import javax.persistence.*;

@Entity
@Table(name="event_role")
public class EventRole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="event_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventId;
	
	@Column(name="user_role")
	private String userRole;

	public EventRole() {
		super();
	}

	public EventRole(int userId, int eventId, String userRole) {
		super();
		this.userId = userId;
		this.eventId = eventId;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "EventRole [id=" + id + ", userId=" + userId + ", eventId=" + eventId + ", userRole=" + userRole + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
