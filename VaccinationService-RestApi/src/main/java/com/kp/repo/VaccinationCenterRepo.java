package com.kp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kp.entity.VaccinationCenter;

@Repository
public interface VaccinationCenterRepo extends JpaRepository<VaccinationCenter, Integer> {
	
	
	

}
