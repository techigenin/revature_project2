package com.revature.festivalapp.pojos;

import java.util.Arrays;

public class EventHomeDTO {

	private Stage[] stages;
	private ScheduleDTO[] scheduleDTOs;
	public EventHomeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventHomeDTO(Stage[] stages, ScheduleDTO[] scheduleDTOs) {
		super();
		this.stages = stages;
		this.scheduleDTOs = scheduleDTOs;
	}
	@Override
	public String toString() {
		return "EventHomeDTO [stages=" + Arrays.toString(stages) + ", scheduleDTOs=" + Arrays.toString(scheduleDTOs)
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(scheduleDTOs);
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
		EventHomeDTO other = (EventHomeDTO) obj;
		if (!Arrays.equals(scheduleDTOs, other.scheduleDTOs))
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
	public ScheduleDTO[] getScheduleDTOs() {
		return scheduleDTOs;
	}
	public void setScheduleDTOs(ScheduleDTO[] scheduleDTOs) {
		this.scheduleDTOs = scheduleDTOs;
	}

}
