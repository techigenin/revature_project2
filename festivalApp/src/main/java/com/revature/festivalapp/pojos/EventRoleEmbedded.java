package com.revature.festivalapp.pojos;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EventRoleEmbedded implements Serializable {

	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="event_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventId;

	public EventRoleEmbedded() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventRoleEmbedded(int id, int eventId) {
		super();
		this.id = id;
		this.eventId = eventId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eventId;
		result = prime * result + id;
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
		EventRoleEmbedded other = (EventRoleEmbedded) obj;
		if (eventId != other.eventId)
			return false;
		if (id != other.id)
			return false;
		return true;
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
	
	
	
	
}
