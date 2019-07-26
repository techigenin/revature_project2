package com.revature.festivalapp.pojos;

import java.time.LocalDate;

public class DetailsDTO {
	
	private String eventRole;
	private FestivalEvent event;
	private LocalDate eventStartDate;
	private LocalDate eventEndDate;
	public DetailsDTO() {
		super();
	}
	public DetailsDTO(String eventRole, FestivalEvent event, LocalDate eventStartDate, LocalDate eventEndDate) {
		super();
		this.eventRole = eventRole;
		this.event = event;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
	}
	@Override
	public String toString() {
		return "DetailsDTO [eventRole=" + eventRole + ", event=" + event + ", eventStartDate=" + eventStartDate
				+ ", eventEndDate=" + eventEndDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((eventEndDate == null) ? 0 : eventEndDate.hashCode());
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
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (eventEndDate == null) {
			if (other.eventEndDate != null)
				return false;
		} else if (!eventEndDate.equals(other.eventEndDate))
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
	public FestivalEvent getEvent() {
		return event;
	}
	public void setEvent(FestivalEvent event) {
		this.event = event;
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
