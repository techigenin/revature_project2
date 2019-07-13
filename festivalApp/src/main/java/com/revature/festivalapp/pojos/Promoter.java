package com.revature.festivalapp.pojos;

public class Promoter extends User {
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
		
