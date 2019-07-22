package com.revature.festivalapp.pojos;

import java.time.LocalDate;

import javax.persistence.*;

import com.revature.festivalapp.util.LocalDateAttributeConverter;

@Entity
@Table(name="festival_event")
public class FestivalEvent {
  
	@Id
	@Column(name="event_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eventNumer;
	
	@Column(name="audience_capacity")
	private Integer audienceCapacity;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="event_location")
	private String eventLocation;
	
	@Column(name="event_start_date")
	@Convert(converter=LocalDateAttributeConverter.class)
	private LocalDate startDate;
	
	@Column(name="event_end_date")
	@Convert(converter=LocalDateAttributeConverter.class)
	private LocalDate endDate;
	
	@Column(name="event_desc")
	private String eventDescription;
	
	@ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@JoinColumn(name="manager_id")
	private User manager;

	public FestivalEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FestivalEvent(Integer audieceCapacity, String eventName, String eventLocation,
			LocalDate startDate, LocalDate endDate, String eventDescription, User manager) {
		super();
		this.audienceCapacity = audieceCapacity;
		this.eventName = eventName;
		this.eventLocation = eventLocation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventDescription = eventDescription;
		this.manager = manager;
	}

	public Integer getEventNumer() {
		return eventNumer;
	}

	public void setEventNumer(Integer eventNumer) {
		this.eventNumer = eventNumer;
	}

	public Integer getAudienceCapacity() {
		return audienceCapacity;
	}

	public void setAudienceCapacity(Integer audieceCapacity) {
		this.audienceCapacity = audieceCapacity;
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

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "FestivalEvent [eventNumer=" + eventNumer + ", audieceCapacity=" + audienceCapacity + ", eventName="
				+ eventName + ", eventLocation=" + eventLocation + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", eventDescription=" + eventDescription + ", manager=" + manager + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((audienceCapacity == null) ? 0 : audienceCapacity.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
		result = prime * result + ((eventLocation == null) ? 0 : eventLocation.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventNumer == null) ? 0 : eventNumer.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
		if (audienceCapacity == null) {
			if (other.audienceCapacity != null)
				return false;
		} else if (!audienceCapacity.equals(other.audienceCapacity))
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
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	
	
	
}
