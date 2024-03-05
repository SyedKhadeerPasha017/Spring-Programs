package com.kp.service;

import java.util.List;

import com.kp.model.Electricity;

public interface ElectricityService {
	
	public Electricity saveRecord(Electricity electricity);
	public Electricity updateRecord(Electricity electricity,int cid);
	public void deleteRecord(int cid);
	public Electricity getOneRecord(int cid);
	public List<Electricity> getAllRecords();

	

}
