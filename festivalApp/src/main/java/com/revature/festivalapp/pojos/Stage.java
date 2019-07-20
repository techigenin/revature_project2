package com.revature.festivalapp.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stage")
public class Stage {
	
	@Id
	@Column(name="stage_number")
	private Integer stageNumber;
	
	@ManyToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	@JoinColumn(name="event_number")
	private FestivalEvent festivalEvent;
	
	@Column(name="stage_name")
	private String stageName;
	
	@OneToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
	@JoinColumn(name="crew_id")
	private User crew;


	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stage(Integer stageNumber, FestivalEvent festivalEvent, String stageName, User crew) {
		super();
		this.stageNumber = stageNumber;
		this.festivalEvent = festivalEvent;
		this.stageName = stageName;
		this.crew = crew;
	}

	@Override
	public String toString() {
		return "Stage [stageNumber=" + stageNumber + ", festivalEvent=" + festivalEvent + ", stageName=" + stageName
				+ ", crew=" + crew + "]";
	}

	public Integer getStageNumber() {
		return stageNumber;
	}

	public void setStageNumber(Integer stageNumber) {
		this.stageNumber = stageNumber;
	}

	public FestivalEvent getFestivalEvent() {
		return festivalEvent;
	}

	public void setFestivalEvent(FestivalEvent festivalEvent) {
		this.festivalEvent = festivalEvent;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public User getCrew() {
		return crew;
	}

	public void setCrew(User crew) {
		this.crew = crew;
	}


}

	
	
	
	