package com.revature.festivalapp.dao;

import java.util.List;

import com.revature.festivalapp.pojos.RegInfo;

public interface RegInfoDAO {
	
	public void insertRegInfo(RegInfo a);
	
	public RegInfo getRegInfo(int i);

	public List<RegInfo> getAllRegInfo();
	
	public void updateRegInfo(RegInfo a);
	
	public void deleteRegInfo(RegInfo a);
}
