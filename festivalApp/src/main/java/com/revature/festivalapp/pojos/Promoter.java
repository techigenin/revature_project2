package com.revature.festivalapp.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="promoter")
public class Promoter extends User {
	
//	@Column(name="artist_name")
	private String promoterName;

	public Promoter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promoter(String email) {
		super(email);
		// TODO Auto-generated constructor stub
	}

	public Promoter(String email, String promoterName) {
		super(email);
		this.promoterName = promoterName;
	}

	public String getPromoterName() {
		return promoterName;
	}

	public void setPromoterName(String promoterName) {
		this.promoterName = promoterName;
	}
}
