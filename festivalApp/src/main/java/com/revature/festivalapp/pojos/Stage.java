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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stageNumber;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="event_number")
	private Integer eventNumber;
	
	@Column(name="stage_name")
	private String stageName;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private User crew;

	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stage(Integer stageNumber, Integer eventNumber, String stageName, User crew) {
		super();
		this.stageNumber = stageNumber;
		this.eventNumber = eventNumber;
		this.stageName = stageName;
		this.crew = crew;
	}

	@Override
	public String toString() {
		return "Stage [stageNumber=" + stageNumber + ", eventNumber=" + eventNumber + ", stageName=" + stageName
				+ ", crew=" + crew + "]";
	}

	public Integer getStageNumber() {
		return stageNumber;
	}

	public void setStageNumber(Integer stageNumber) {
		this.stageNumber = stageNumber;
	}

	public Integer getEventNumber() {
		return eventNumber;
	}

	public void setEventNumber(Integer eventNumber) {
		this.eventNumber = eventNumber;
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
	
	
	