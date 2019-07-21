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

	public EventRole(int id, int eventId, String userRole) {
		super();
		this.id = id;
		this.eventId = eventId;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "EventRole [id=" + id + ", eventId=" + eventId + ", userRole=" + userRole + "]";
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getEventId() {
		return eventId;
	}

	void setEventId(int eventId) {
		this.eventId = eventId;
	}

	String getUserRole() {
		return userRole;
	}

	void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
