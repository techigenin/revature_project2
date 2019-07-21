package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="schedule_id")
	private int scheduleId;
	
	@OneToOne
	@JoinColumn(name="stage_number")
	private Stage  stageNumber;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="start_time")
	private LocalDateTime startTime;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="end_time")
	private LocalDateTime endTime;
	
	@Column(name="artist_name")
	private String artistName;

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schedule(int scheduleId, Stage stageNumber, LocalDateTime startTime, LocalDateTime endTime,
			String artistName) {
		super();
		this.scheduleId = scheduleId;
		this.stageNumber = stageNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", stageNumber=" + stageNumber + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", artistName=" + artistName + "]";
	}

	int getScheduleId() {
		return scheduleId;
	}

	void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	Stage getStageNumber() {
		return stageNumber;
	}

	void setStageNumber(Stage stageNumber) {
		this.stageNumber = stageNumber;
	}

	LocalDateTime getStartTime() {
		return startTime;
	}

	void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	LocalDateTime getEndTime() {
		return endTime;
	}

	void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	String getArtistName() {
		return artistName;
	}

	void setArtistName(String artistName) {
		this.artistName = artistName;
	}
		
}
		 	



