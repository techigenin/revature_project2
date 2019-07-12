package com.revature.festivalapp.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="festival_event")
public class FestivalEvent {
	
	@Id
	@Column(name="event_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eventNumer;
	
	@Column(name="audience_capacity")
	private Integer audieceCapacity;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="event_location")
	private String eventLocation;
	
	@Column(name="event_start_date")
	private LocalDate startDate;
	
	@Column(name="event_end_date")
	private LocalDate endDate;
	
	@Column(name="event_desc")
	private String eventDescription;
	
	@Column(name="manager_email")
	private String managerEmail;
	
	public FestivalEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FestivalEvent(Integer eventNumer, Integer audieceCapacity, String eventName, String eventLocation,
			LocalDate startDate, LocalDate endDate, String eventDescription, String managerEmail) {
		super();
		this.eventNumer = eventNumer;
		this.audieceCapacity = audieceCapacity;
		this.eventName = eventName;
		this.eventLocation = eventLocation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventDescription = eventDescription;
		this.managerEmail = managerEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((audieceCapacity == null) ? 0 : audieceCapacity.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
		result = prime * result + ((eventLocation == null) ? 0 : eventLocation.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventNumer == null) ? 0 : eventNumer.hashCode());
		result = prime * result + ((managerEmail == null) ? 0 : managerEmail.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		FestivalEvent other = (FestivalEvent) obj;
		if (audieceCapacity == null) {
			if (other.audieceCapacity != null)
				return false;
		} else if (!audieceCapacity.equals(other.audieceCapacity))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (eventDescription == null) {
			if (other.eventDescription != null)
				return false;
		} else if (!eventDescription.equals(other.eventDescription))
			return false;
		if (eventLocation == null) {
			if (other.eventLocation != null)
				return false;
		} else if (!eventLocation.equals(other.eventLocation))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventNumer == null) {
			if (other.eventNumer != null)
				return false;
		} else if (!eventNumer.equals(other.eventNumer))
			return false;
		if (managerEmail == null) {
			if (other.managerEmail != null)
				return false;
		} else if (!managerEmail.equals(other.managerEmail))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	public Integer getEventNumer() {
		return eventNumer;
	}
	public void setEventNumer(Integer eventNumer) {
		this.eventNumer = eventNumer;
	}
	public Integer getAudieceCapacity() {
		return audieceCapacity;
	}
	public void setAudieceCapacity(Integer audieceCapacity) {
		this.audieceCapacity = audieceCapacity;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	
	
}
