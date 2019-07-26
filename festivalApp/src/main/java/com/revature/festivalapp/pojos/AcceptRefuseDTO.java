package com.revature.festivalapp.pojos;

public class AcceptRefuseDTO {
	
	private Long requestNumber;
	private Boolean accept;
	
	public AcceptRefuseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcceptRefuseDTO(long requestNumber, boolean accept) {
		super();
		this.requestNumber = requestNumber;
		this.accept = accept;
	}

	@Override
	public String toString() {
		return "AcceptRefuseDTO [requestNumber=" + requestNumber + ", accept=" + accept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accept ? 1231 : 1237);
		result = prime * result + (int) (requestNumber ^ (requestNumber >>> 32));
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
		AcceptRefuseDTO other = (AcceptRefuseDTO) obj;
		if (accept != other.accept)
			return false;
		if (requestNumber != other.requestNumber)
			return false;
		return true;
	}

	public long getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(long requestNumber) {
		this.requestNumber = requestNumber;
	}

	public boolean getAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}
	
	
	
	

}
