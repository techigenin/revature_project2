package com.revature.festivalapp.pojos;

import java.util.Arrays;

public class EventManagementDTO {
	
	private Stage[] stages;
	private Schedule[] schedules;
	private EventRole[] eventRoles;
	
	public EventManagementDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventManagementDTO(Stage[] stages, Schedule[] schedules, EventRole[] eventRoles) {
		super();
		this.stages = stages;
		this.schedules = schedules;
		this.eventRoles = eventRoles;
	}

	@Override
	public String toString() {
		return "EventManagementDTO [stages=" + Arrays.toString(stages) + ", schedules=" + Arrays.toString(schedules)
				+ ", eventRoles=" + Arrays.toString(eventRoles) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(eventRoles);
		result = prime * result + Arrays.hashCode(schedules);
		result = prime * result + Arrays.hashCode(stages);
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
		EventManagementDTO other = (EventManagementDTO) obj;
		if (!Arrays.equals(eventRoles, other.eventRoles))
			return false;
		if (!Arrays.equals(schedules, other.schedules))
			return false;
		if (!Arrays.equals(stages, other.stages))
			return false;
		return true;
	}

	public Stage[] getStages() {
		return stages;
	}

	public void setStages(Stage[] stages) {
		this.stages = stages;
	}

	public Schedule[] getSchedules() {
		return schedules;
	}

	public void setSchedules(Schedule[] schedules) {
		this.schedules = schedules;
	}

	public EventRole[] getEventRoles() {
		return eventRoles;
	}

	public void setEventRoles(EventRole[] eventRoles) {
		this.eventRoles = eventRoles;
	}
}
