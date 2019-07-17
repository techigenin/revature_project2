package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
//name of the table  in DB
@Table(name="schedule")
@IdClass(Stage.class)

public class Schedule {
//reference for composite key
//https://www.concretepage.com/hibernate/example-embeddedid-hibernate
	
	// we should create sequence in the database table start_time_sequence
//	@SequenceGenerator(name="start_time_sequence", sequenceName="start_time_sequence")
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Using serial vs sequence
	@EmbeddedId
	//in AttributeOverride we combine the two keys as a composite key 
	@AttributeOverride(name="stage_number", column=@Column(name="start_time"))
	private ScheduleEmbedded se;
	
	@Column(name="end_time")
	private LocalDateTime endTime;
	
	@Column(name="artist_name")
	private String crewEmail;
		 	
	public Schedule() {
		super();
	}
	// inside the scheduleEmbedded we have the composite key			
	public Schedule(ScheduleEmbedded se, LocalDateTime endTime, String crewEmail) {

		this.se=se;
		
		this.endTime = endTime;
		this.crewEmail = crewEmail;
	}

	
	public ScheduleEmbedded getSe() {
		return se;
	}
	public void setSe(ScheduleEmbedded se) {
		this.se = se;
	}
	
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getCrewEmail() {
		return crewEmail;
	}
	public void setCrewEmail(String crewEmail) {
		this.crewEmail = crewEmail;
	}
}
