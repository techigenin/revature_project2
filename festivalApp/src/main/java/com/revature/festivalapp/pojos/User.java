package com.revature.festivalapp.pojos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

// @MappedSuperclass -- Turned out to not be what we wanted...
@Entity
@Table(name="users")
//@Inheritance(strategy = InheritanceType.JOINED)
@Component
public class User  {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)// thats for serial 
	private int id;
	
	@Column(name="val_email")
	private String email;
	
	@Column(name="val_password")
	private String password;
	
	@Column(name="collected_roles")
	private String collectedRoles;
	
	@Column(name="manager_name")
	private String managerName;
	
	@Column(name="artist_name")
	private String artistName;
	
	@Column(name="promoter_name")
	private String promoterName;
	
//	@Transient
//	private EventRole currentRole;
//
//	@Transient
//	private FestivalEvent currentEvent;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, String collectedRoles, String managerName, String artistName, String promoterName) {
	super();
	this.email = email;
	this.password = password;
	this.collectedRoles = collectedRoles;
	this.managerName = managerName;
	this.artistName = artistName;
	this.promoterName = promoterName;
	}

	public User(UserDTO u) {
		super();
		this.email = u.getUsername();
		this.password = u.getPassword();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((collectedRoles == null) ? 0 : collectedRoles.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((promoterName == null) ? 0 : promoterName.hashCode());
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
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
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
		if (id != other.id)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (promoterName == null) {
			if (other.promoterName != null)
				return false;
		} else if (!promoterName.equals(other.promoterName))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCollectedRoles() {
		return collectedRoles;
	}

	public void setCollectedRoles(String collectedRoles) {
		this.collectedRoles = collectedRoles;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getPromoterName() {
		return promoterName;
	}

	public void setPromoterName(String promoterName) {
		this.promoterName = promoterName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", collectedRoles=" + collectedRoles
				+ ", managerName=" + managerName + ", artistName=" + artistName + ", promoterName=" + promoterName
				+ "]";
	}

	/**
	 * When a user is added to an event
	 * This method ensures that their role is included in collected roles.
	 * 
	 * @param role to be added for the user
	 * @return String which is stored to collected roles
	 */
	public String addRole(String role) {
		Set<String> roles = new HashSet<String>();
		roles.addAll(Arrays.asList(collectedRoles.split(",")));
		
		roles.add(role.toLowerCase());
		
		String ret = "";
		
		if (roles.size() > 0) {
			Iterator<String> iterator = roles.iterator();
			
			ret += iterator.next();
			
			while(iterator.hasNext()) 
				ret += ", " + iterator.next();
		}
		
		collectedRoles = role;
		
		return ret;
	}
	


	/**
	 * A quick way to check if current user is a manager
	 * 
	 * @return boolean, true if user is manager
	 */
	public boolean isManager() {
		return (collectedRoles.toLowerCase().contains("manager")) ? true : false;
	}
	
	/**
	 * A quick way to check if current user is an artist
	 * 
	 * @return boolean, true if user is artist
	 */
	public boolean isArtist() {
		return (collectedRoles.toLowerCase().contains("artist")) ? true : false;
	}
	
	/**
	 * A quick way to check if current user is a promoter
	 * 
	 * @return boolean, true if user is promoter
	 */
	public boolean isPromoter() {
		return (collectedRoles.toLowerCase().contains("promoter")) ? true : false;
	}
	
	/**
	 * A quick way to check if current user is a crew
	 * 
	 * @return boolean, true if user is crew
	 */
		public boolean isCrew() {
			return (collectedRoles.toLowerCase().contains("crew")) ? true : false;
		}
	
	/**
	 * A quick way to check if current user is a customer
	 * 
	 * @return boolean, true if user is customer
	 */
	public boolean isCustomer() {
		return (collectedRoles.toLowerCase().contains("customer")) ? true : false;
	}
}
	