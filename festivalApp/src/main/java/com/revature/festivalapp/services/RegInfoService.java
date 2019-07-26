package com.revature.festivalapp.services;

import java.util.List;

import com.revature.festivalapp.pojos.RegInfo;

public interface RegInfoService {
	
	public void insertRegInfo(RegInfo a);
	public RegInfo getRegInfo(long i);
	public List<RegInfo> getAllRegInfo();
	public void updateRegInfo(RegInfo a);
	public void deleteRegInfo(RegInfo a);

}
