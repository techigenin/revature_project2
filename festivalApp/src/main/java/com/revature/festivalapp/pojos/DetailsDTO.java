package com.revature.festivalapp.pojos;

import java.time.LocalDate;

public class DetailsDTO {
	
	private String eventRole;
	private String eventName;
	private LocalDate eventStartDate;
	private LocalDate eventEndDate;
	
	public DetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetailsDTO(String eventRole, String eventName, LocalDate eventStartDate, LocalDate eventEndDate) {
		super();
		this.eventRole = eventRole;
		this.eventName = eventName;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
	}

	@Override
	public String toString() {
		return "DetailsDTO [eventRole=" + eventRole + ", eventName=" + eventName + ", eventStartDate=" + eventStartDate
				+ ", eventEndDate=" + eventEndDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventEndDate == null) ? 0 : eventEndDate.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventRole == null) ? 0 : eventRole.hashCode());
		result = prime * result + ((eventStartDate == null) ? 0 : eventStartDate.hashCode());
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
		DetailsDTO other = (DetailsDTO) obj;
		if (eventEndDate == null) {
			if (other.eventEndDate != null)
				return false;
		} else if (!eventEndDate.equals(other.eventEndDate))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventRole == null) {
			if (other.eventRole != null)
				return false;
		} else if (!eventRole.equals(other.eventRole))
			return false;
		if (eventStartDate == null) {
			if (other.eventStartDate != null)
				return false;
		} else if (!eventStartDate.equals(other.eventStartDate))
			return false;
		return true;
	}

	public String getEventRole() {
		return eventRole;
	}

	public void setEventRole(String eventRole) {
		this.eventRole = eventRole;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(LocalDate eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public LocalDate getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(LocalDate eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	
	
	
}
