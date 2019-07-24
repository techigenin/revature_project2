package com.revature.festivalapp.pojos;

public class AcceptRefuseDTO {
	
	private int requestNumber;
	private boolean accept;
	
	public AcceptRefuseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AcceptRefuseDTO(int requestNumber, boolean accept) {
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
		result = prime * result + requestNumber;
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

	public int getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}

	public boolean getAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}
	
	

}
