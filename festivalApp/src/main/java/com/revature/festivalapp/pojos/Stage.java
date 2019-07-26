package com.revature.festivalapp.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@ManyToOne
	@JoinColumn(name="event_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private FestivalEvent festivalEvent;
	
	@Column(name="stage_name")
	private String stageName;
	
	@OneToOne
	@JoinColumn(name="crew_id", referencedColumnName="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crew == null) ? 0 : crew.hashCode());
		result = prime * result + ((festivalEvent == null) ? 0 : festivalEvent.hashCode());
		result = prime * result + ((stageName == null) ? 0 : stageName.hashCode());
		result = prime * result + ((stageNumber == null) ? 0 : stageNumber.hashCode());
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
		Stage other = (Stage) obj;
		if (crew == null) {
			if (other.crew != null)
				return false;
		} else if (!crew.equals(other.crew))
			return false;
		if (festivalEvent == null) {
			if (other.festivalEvent != null)
				return false;
		} else if (!festivalEvent.equals(other.festivalEvent))
			return false;
		if (stageName == null) {
			if (other.stageName != null)
				return false;
		} else if (!stageName.equals(other.stageName))
			return false;
		if (stageNumber == null) {
			if (other.stageNumber != null)
				return false;
		} else if (!stageNumber.equals(other.stageNumber))
			return false;
		return true;
	}


	
}

	
	
	
	