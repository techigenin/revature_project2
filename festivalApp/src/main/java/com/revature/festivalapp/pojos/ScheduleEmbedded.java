package com.revature.festivalapp.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.revature.festival.util.LocalDateTimeAttributeConverter;
@Embeddable
//@IdClass(Stage.class)
public class ScheduleEmbedded implements Serializable {

	@OneToOne
	@JoinColumn(name="stage_number")
	private Stage  stageNumber;
	
	@Convert(converter=LocalDateTimeAttributeConverter.class)
	@Column(name="start_time")
	private LocalDateTime startTime;
	
	
	public Stage getStageNumber() {
		return stageNumber;
	}

	
	
	
	public ScheduleEmbedded() {
			}




	public ScheduleEmbedded(Stage stageNumber, LocalDateTime startTime) {
		this.stageNumber = stageNumber;
		this.startTime = startTime;
	}




	@Override
	public String toString() {
		return "ScheduleEmbedded [stageNumber=" + stageNumber + ", startTime=" + startTime + "]";
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

	
}
