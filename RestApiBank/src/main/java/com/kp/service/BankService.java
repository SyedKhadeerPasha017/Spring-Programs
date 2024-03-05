package com.kp.service;

import com.kp.model.AmountResult;
import com.kp.model.Bank;
import com.kp.model.TransferDet;

public interface BankService {

	
	public Bank saveAccount(Bank bank);
	public Bank getBalance(int account_no,String name,String password);
	public AmountResult depositAmount(int account_no,String name,String password,double amount);
	public AmountResult withdrawAmount(int account_no,String name,String password,double amount);
	public TransferDet transferAmount(int account_no,String name,String password,int targetAccount,double amount);
	public Bank closeAccount(int account_no,String name,String password);
}
