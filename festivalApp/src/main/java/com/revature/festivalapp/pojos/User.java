package com.revature.festivalapp.pojos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

// @MappedSuperclass -- Turned out to not be what we wanted...
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User  {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	@Transient
	private EventRole currentRole;

	@Transient
	private FestivalEvent currentEvent;
	
	
	public User() {
		super();
	}

	public User(String email, String password, String collectedRoles, String managerName, String artistName,
			String promoterName, EventRole eventRole) {
		super();
		this.email = email;
		this.password = password;
		this.collectedRoles = collectedRoles;
		this.managerName = managerName;
		this.artistName = artistName;
		this.promoterName = promoterName;
		this.currentRole = eventRole;
	}

	public User(String email, String password, String collectedRoles, String managerName, String artistName,
			String promoterName) {
		super();
		this.email = email;
		this.password = password;
		this.collectedRoles = collectedRoles;
		this.managerName = managerName;
		this.artistName = artistName;
		this.promoterName = promoterName;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", collectedRoles=" + collectedRoles
				+ ", managerName=" + managerName + ", artistName=" + artistName + ", promoterName=" + promoterName
				+ ", eventRole=" + currentRole + "]";
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

	public EventRole getEventRole() {
		return currentRole;
	}

	public void setEventRole(EventRole eventRole) {
		this.currentRole = eventRole;
	}
	
	public EventRole getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(EventRole currentRole) {
		this.currentRole = currentRole;
	}

	public FestivalEvent getCurrentEvent() {
		return currentEvent;
	}

	public void setCurrentEvent(FestivalEvent currentEvent) {
		this.currentEvent = currentEvent;
	}
}
	