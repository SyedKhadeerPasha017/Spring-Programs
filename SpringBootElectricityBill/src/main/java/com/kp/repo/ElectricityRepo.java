package com.kp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kp.model.Electricity;

public interface ElectricityRepo extends JpaRepository<Electricity, Integer> {

}
