package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.revature.festivalapp.util.LocalDateTimeAttributeConverter;



@Entity
@Table(name="schedule")//name of the table  in DB
public class Schedule {
//reference for composite key
//https://www.concretepage.com/hibernate/example-embeddedid-hibernate
//we should create sequence in the database table start_time_sequence
//@SequenceGenerator(name="start_time_sequence", sequenceName="start_time_sequence")	
//@GeneratedValue(strategy=GenerationType.IDENTITY) // Using serial vs sequence
//@AttributeOverride(name="stage_number", column=@Column(name="start_time"))	//in AttributeOverride we combine the two keys as a composite key 	
	
	
	
	@EmbeddedId
	private ScheduleEmbedded se;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="end_time")
	private LocalDateTime endTime;
	
	@Column(name="artist_name")
	private String artistName;

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

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Schedule() {
		super();
		}

	public Schedule(ScheduleEmbedded se, LocalDateTime endTime, String artistName) {
		super();
		this.se = se;
		this.endTime = endTime;
		this.artistName = artistName;
	}
	
	public Schedule(Stage s, LocalDateTime startTime, LocalDateTime endTime, String artistName) {
		super();

		ScheduleEmbedded se = new ScheduleEmbedded(s, startTime);
		
		this.se = se;
		this.endTime = endTime;
		this.artistName = artistName;
	}

		
	
	
	@Override
	public String toString() {
		return "Schedule [se=" + se + ", endTime=" + endTime + ", artistName=" + artistName + "]";
	}
		
}
		 	



