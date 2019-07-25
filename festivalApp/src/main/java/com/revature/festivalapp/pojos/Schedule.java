package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Stage stage;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="start_time")
	private LocalDateTime startTime;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="end_time")
	private LocalDateTime endTime;
	
	@OneToOne
	@JoinColumn(name="artist", referencedColumnName="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private User artist;

	public Schedule() {
		super();
	}

	public Schedule(int scheduleId, Stage stageNumber, LocalDateTime startTime, LocalDateTime endTime, User artist) {
		super();
		this.scheduleId = scheduleId;
		this.stage = stageNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", stageNumber=" + stage + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", artist=" + artist + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + scheduleId;
		result = prime * result + ((stage == null) ? 0 : stage.hashCode());
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
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (stage == null) {
			if (other.stage != null)
				return false;
		} else if (!stage.equals(other.stage))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Stage getStageNumber() {
		return stage;
	}

	public void setStageNumber(Stage stageNumber) {
		this.stage = stageNumber;
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

	public User getArtist() {
		return artist;
	}

	public void setArtist(User artist) {
		this.artist = artist;
	}


}
		 	



