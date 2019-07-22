package com.revature.festivalapp.pojos;

public class ScheduleDTO {
	
	private Stage stageNumber;
	private String startTime;
	private String endTime;
	private String artistname;
	
	public ScheduleDTO() {
		super();
	}

	public ScheduleDTO(Stage stageNumber, String startTime, String endTime, String artistname) {
		super();
		this.stageNumber = stageNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.artistname = artistname;
	}
	
	public ScheduleDTO(Schedule sched) {
		super();
		this.stageNumber = sched.getStageNumber();
		this.startTime = sched.getStartTime().toString();
		this.endTime = sched.getEndTime().toString();
		this.artistname = sched.getArtistName();
	}

	@Override
	public String toString() {
		return "ScheduleDTO [stageNumber=" + stageNumber + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", artistname=" + artistname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistname == null) ? 0 : artistname.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((stageNumber == null) ? 0 : stageNumber.hashCode());
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
		ScheduleDTO other = (ScheduleDTO) obj;
		if (artistname == null) {
			if (other.artistname != null)
				return false;
		} else if (!artistname.equals(other.artistname))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (stageNumber == null) {
			if (other.stageNumber != null)
				return false;
		} else if (!stageNumber.equals(other.stageNumber))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

	public Stage getStageNumber() {
		return stageNumber;
	}
	public void setStageNumber(Stage stageNumber) {
		this.stageNumber = stageNumber;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
}
