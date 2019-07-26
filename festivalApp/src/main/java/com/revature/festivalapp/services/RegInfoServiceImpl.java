package com.revature.festivalapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.festivalapp.dao.RegInfoDAO;
import com.revature.festivalapp.dao.RegInfoDAOImpl;
import com.revature.festivalapp.pojos.RegInfo;

@Service
public class RegInfoServiceImpl implements RegInfoService {

	RegInfoDAO regInfoDAO;// = new RegInfoDAOImpl();
	
	@Autowired
	public void setRegInfoDAO(RegInfoDAO regInfoDAO) {
		this.regInfoDAO = regInfoDAO;
	}

	@Override
	public void insertRegInfo(RegInfo a) {
		regInfoDAO.insertRegInfo(a);
	}

	@Override
	public RegInfo getRegInfo(long i) {
		return regInfoDAO.getRegInfo(i);
	}

	@Override
	public List<RegInfo> getAllRegInfo() {
		return regInfoDAO.getAllRegInfo();
	}

	@Override
	public void updateRegInfo(RegInfo a) {
		regInfoDAO.updateRegInfo(a);
	}

	@Override
	public void deleteRegInfo(RegInfo a) {
		regInfoDAO.deleteRegInfo(a);
	}

}
