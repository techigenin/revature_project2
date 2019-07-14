package com.revature.festivalapp.pojos;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.*;

// @MappedSuperclass -- Turned out to not be what we wanted...
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User  {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="val_email")
	private String email;
	
	@Column(name="val_password")
	private String password;
	
	@Column(name="collected_roles")
	private Set<String> collectedRoles;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String email, String password, Set<String> collectedRoles) {
		super();
		this.userId = user_id;
		this.email = email;
		this.password = password;
		this.collectedRoles = collectedRoles;
	}

	@Override
	public String toString() {
		return "User [user_id=" + userId + ", email=" + email + ", password=" + password + ", collectedRoles="
				+ collectedRoles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectedRoles == null) ? 0 : collectedRoles.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
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
		User other = (User) obj;
		if (collectedRoles == null) {
			if (other.collectedRoles != null)
				return false;
		} else if (!collectedRoles.equals(other.collectedRoles))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
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

	public Set<String> getCollectedRoles() {
		return collectedRoles;
	}

	public void setCollectedRoles(String collectedRoles) {
		this.collectedRoles.addAll(Arrays.asList(collectedRoles.split(",")));
	}
	
	public void setCollectedRoles(Set<String> collectedRoles) {
		this.collectedRoles = collectedRoles;
	}
}
	