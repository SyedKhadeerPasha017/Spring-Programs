package com.kp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kp.model.AmountResult;
import com.kp.model.Bank;
import com.kp.model.Bank.AccountStatus;
import com.kp.model.TransferDet;
import com.kp.repo.BankRepo;

@Service

public class BankServiceImp implements BankService {
	
	@Autowired
	private BankRepo repo;
	
	@Override
	public Bank saveAccount(Bank bank) {
		
		Bank save = repo.save(bank);
		return save;
	}

	@Override
	public Bank getBalance(int account_no, String name, String password) {
		
		Bank getAccount = repo.findById(account_no).get();
		if(account_no == getAccount.getAccount_no() && name.equals(getAccount.getName()) && password.equals(getAccount.getPassword()))
		{
			return getAccount;
		}
		else
		{
			return null;
		}
	}

	@Override
	public AmountResult depositAmount(int account_no, String name, String password, double amount) {
		
		Bank account = repo.findById(account_no).get();
		if(account_no == account.getAccount_no() && name.equals(account.getName()) && password.equals(account.getPassword()))
		{
			double prev = account.getAmount();
			double current = prev + amount;
			account.setAmount(current);
			repo.save(account);
			
			AmountResult deposit = new AmountResult();
			deposit.setPrevious_Balance(prev);
			deposit.setTransaction_amount(amount);
			deposit.setCurrent_Balance(current);
			return deposit;
		}
		else
		{
			return null;
		}
	}

	@Override
	public AmountResult withdrawAmount(int account_no, String name, String password, double amount) {
		
		Bank account = repo.findById(account_no).get();
		if(account_no == account.getAccount_no() && name.equals(account.getName()) && password.equals(account.getPassword()) && amount < account.getAmount())
		{
			double prev = account.getAmount();
			double current = prev - amount;
			account.setAmount(current);
			repo.save(account);
			
			AmountResult withdraw = new AmountResult();
			withdraw.setPrevious_Balance(prev);
			withdraw.setCurrent_Balance(current);
			withdraw.setTransaction_amount(amount);
			return withdraw;
		}
		else
		{
			return null;
		}
	}

	@Override
	public TransferDet transferAmount(int account_no, String name, String password, int targetAccount, double amount) {
		Bank account = repo.findById(account_no).get();
		Bank taccount = repo.findById(targetAccount).get();
		if(account_no == account.getAccount_no() && name.equals(account.getName()) && password.equals(account.getPassword()) && targetAccount == taccount.getAccount_no() && amount < account.getAmount())
		{
			TransferDet details = new TransferDet();
			double prev = account.getAmount();
			double cur = prev - amount;
			account.setAmount(cur);
			repo.save(account);
			
			details.setAccount_no(account_no);
			details.setBalance(prev);
			details.setTransaction_amount(amount);
			
			double previous = taccount.getAmount();
			double current = previous + amount;
			taccount.setAmount(current);
			repo.save(taccount);
			
			details.setTarget_account(targetAccount);
			details.setPrevious_Balance(previous);
			details.setCurrent_Balance(current);
			
			return details;
		}
		else
		{
			return null;
		}
	}

	@Override
	public Bank closeAccount(int account_no, String name, String password) {
		
		Bank details = repo.findById(account_no).get();
		if(account_no == details.getAccount_no() && name.equals(details.getName()) && password.equals(details.getPassword()))
		{
			details.setStatus(AccountStatus.inactive);
			repo.save(details);
			
			return details;
		}
		else
		{
			return null;
		}
	}



}
