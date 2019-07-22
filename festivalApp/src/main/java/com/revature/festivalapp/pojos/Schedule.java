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

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Stage getStageNumber() {
		return stageNumber;
	}

	public void setStageNumber(Stage stageNumber) {
		this.stageNumber = stageNumber;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + scheduleId;
		result = prime * result + ((stageNumber == null) ? 0 : stageNumber.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		Schedule other = (Schedule) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (stageNumber == null) {
			if (other.stageNumber != null)
				return false;
		} else if (!stageNumber.equals(other.stageNumber))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
}
		 	



