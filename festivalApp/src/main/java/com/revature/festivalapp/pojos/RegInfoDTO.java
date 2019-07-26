package com.revature.festivalapp.pojos;

public class RegInfoDTO {
	
	private Long requestNumber;
	
	private String email;
	
	private String password;
	
	private String name;

	public Long getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(Long requestNumber) {
		this.requestNumber = requestNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RegInfoDTO [requestNumber=" + requestNumber + ", email=" + email + ", password=" + password + ", name="
				+ name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((requestNumber == null) ? 0 : requestNumber.hashCode());
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
		RegInfoDTO other = (RegInfoDTO) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (requestNumber == null) {
			if (other.requestNumber != null)
				return false;
		} else if (!requestNumber.equals(other.requestNumber))
			return false;
		return true;
	}

	public RegInfoDTO(Long requestNumber, String email, String password, String name) {
		super();
		this.requestNumber = requestNumber;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public RegInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
