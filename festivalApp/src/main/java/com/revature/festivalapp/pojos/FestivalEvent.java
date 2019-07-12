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
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="manager_email")
	private Manager manager;

	public FestivalEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FestivalEvent(Integer eventNumer, Integer audieceCapacity, String eventName, String eventLocation,
			LocalDate startDate, LocalDate endDate, String eventDescription, Manager manager) {
		super();
		this.eventNumer = eventNumer;
		this.audieceCapacity = audieceCapacity;
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

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "FestivalEvent [eventNumer=" + eventNumer + ", audieceCapacity=" + audieceCapacity + ", eventName="
				+ eventName + ", eventLocation=" + eventLocation + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", eventDescription=" + eventDescription + ", manager=" + manager + "]";
	}
	
}
