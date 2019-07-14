package com.revature.festivalapp.pojos;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="promoter")
@PrimaryKeyJoinColumn(name="id")
public class Promoter extends User {
	
	@Column(name="promo_name")
	private String promoterName;

	public Promoter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promoter(int user_id, String email, String password, Set<String> collectedRoles) {
		super(user_id, email, password, collectedRoles);
		// TODO Auto-generated constructor stub
	}

	public Promoter(String promoterName) {
		super();
		this.promoterName = promoterName;
	}

	@Override
	public String toString() {
		return "Promoter [promoterName=" + promoterName + ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getUser_id()=" + getUser_id() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getCollectedRoles()=" + getCollectedRoles() + ", getClass()=" + getClass() + "]";
	}

	public String getPromoterName() {
		return promoterName;
	}

	public void setPromoterName(String promoterName) {
		this.promoterName = promoterName;
	}
}
		
