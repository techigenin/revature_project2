package com.revature.festivalapp.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stage")
public class Stage {
	
	@Id
	@Column(name="stage_number")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stageNumber;
	
	@Column(name="event_number")
	private Integer eventNumber;
	
	@Column(name="stage_name")
	private String stageName;
	
	@Column(name="crew_email")
	private String crewEmail;
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stage(Integer stageNumber, Integer eventNumber, String stageName, String crewEmail) {
		super();
		this.stageNumber = stageNumber;
		this.eventNumber = eventNumber;
		this.stageName = stageName;
		this.crewEmail = crewEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crewEmail == null) ? 0 : crewEmail.hashCode());
		result = prime * result + ((eventNumber == null) ? 0 : eventNumber.hashCode());
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
		if (crewEmail == null) {
			if (other.crewEmail != null)
				return false;
		} else if (!crewEmail.equals(other.crewEmail))
			return false;
		if (eventNumber == null) {
			if (other.eventNumber != null)
				return false;
		} else if (!eventNumber.equals(other.eventNumber))
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
	public String getCrewEmail() {
		return crewEmail;
	}
	public void setCrewEmail(String crewEmail) {
		this.crewEmail = crewEmail;
	}
}