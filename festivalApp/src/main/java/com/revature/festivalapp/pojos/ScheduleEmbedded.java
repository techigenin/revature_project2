package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

import javax.persistence.Column;


public class ScheduleEmbedded {

	
	@Column(name="stage_number")
	private Integer stageNumber;

	
	@Column(name="start_time")
	private LocalDateTime startTime;
	public Integer getStageNumber() {
		return stageNumber;
	}

	
	
	
	public ScheduleEmbedded() {
			}




	public ScheduleEmbedded(Integer stageNumber, LocalDateTime startTime) {
		this.stageNumber = stageNumber;
		this.startTime = startTime;
	}




	@Override
	public String toString() {
		return "ScheduleEmbedded [stageNumber=" + stageNumber + ", startTime=" + startTime + "]";
	}




	public void setStageNumber(Integer stageNumber) {
		this.stageNumber = stageNumber;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	
}
