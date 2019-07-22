package com.revature.festivalapp.pojos;

import javax.persistence.*;

@Entity
@Table(name="event_role")
public class EventRole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="event_id", referencedColumnName="event_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private FestivalEvent event;
	
	@Column(name="user_role")
	private String userRole;

	public EventRole() {
		super();
	}

	public EventRole(int id, User user, FestivalEvent event, String userRole) {
		super();
		this.id = id;
		this.user = user;
		this.event = event;
		this.userRole = userRole;
	}
	
	public EventRole(User user, FestivalEvent event, String userRole) {
		super();
		this.user = user;
		this.event = event;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "EventRole [id=" + id + ", user=" + user + ", event=" + event + ", userRole=" + userRole + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + id;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (id != other.id)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FestivalEvent getEvent() {
		return event;
	}

	public void setEvent(FestivalEvent event) {
		this.event = event;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	
}
