package com.revature.festivalapp.pojos;

import java.time.LocalDateTime;

public class Schedule {
	private Integer stageNumber;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String crewEmail;
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(Integer stageNumber, LocalDateTime startTime, LocalDateTime endTime, String crewEmail) {
		super();
		this.stageNumber = stageNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.crewEmail = crewEmail;
	}
	public Integer getStageNumber() {
		return stageNumber;
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
