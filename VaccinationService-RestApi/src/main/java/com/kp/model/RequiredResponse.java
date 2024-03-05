package com.kp.model;

import java.util.List;

import com.kp.entity.VaccinationCenter;

public class RequiredResponse {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	public RequiredResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequiredResponse(VaccinationCenter center, List<Citizen> citizens) {
		super();
		this.center = center;
		this.citizens = citizens;
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	@Override
	public String toString() {
		return "RequiredResponse []";
	}


}
