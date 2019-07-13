package com.revature.festivalapp.pojos;

public class Promoter extends User {
	private String promoterName;

	public Promoter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promoter(int user_id, String email) {
		super(user_id, email);
		// TODO Auto-generated constructor stub
	}

	public String getPromoterName() {
		return promoterName;
	}

	public void setPromoterName(String promoterName) {
		this.promoterName = promoterName;
	}
}
		
