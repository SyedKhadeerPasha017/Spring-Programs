package com.kp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kp.model.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
