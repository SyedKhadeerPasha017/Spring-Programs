package com.kp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kp.entity.VaccinationCenter;
import com.kp.model.Citizen;
import com.kp.model.RequiredResponse;
import com.kp.repo.VaccinationCenterRepo;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
	
	 @Autowired 
	 private RestTemplate restTemplate; 
	
	@Autowired
	private VaccinationCenterRepo centerRepo;
	@GetMapping("/test")
	public String home()
	{
		return "welcome to vaccination center";
	}
	
	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter newCenter)
	{
		VaccinationCenter center=centerRepo.save(newCenter);
		return new ResponseEntity<>(center,HttpStatus.OK);
	}
	
	 @GetMapping("/get/{id}") 
	 public ResponseEntity<RequiredResponse> getdata(@PathVariable int id) 
	 { 
	  RequiredResponse requiredResponse=new RequiredResponse(); 
	   
	  // This is for VaccinationCenter Center Details 
	  VaccinationCenter center=centerRepo.findById(id).get(); 
	  requiredResponse.setCenter(center);
	   
	 // Then Get citizen registered to VaccinationCenter Details 
	 List<Citizen> listOfCitizens=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+id,List.class); 
	 requiredResponse.setCitizens(listOfCitizens);  
	 return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK); 
	   
	   
	 } 

}
