package com.revature.festivalapp.pojos;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {

	private String username;
	
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + "]";
	}

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}
		
}
