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
	
	//@ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
	@ManyToOne
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
	
}
