package com.kp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kp.model.AmountResult;
import com.kp.model.Bank;
import com.kp.model.TransferDet;
import com.kp.service.BankServiceImp;

@RestController

public class BankController {
	
	@Autowired
	private BankServiceImp service;
	
	@PostMapping("/save")
	public String saveAccount(@RequestBody Bank bank)
	{
		Bank b = service.saveAccount(bank);
		return "Success";
	}
	
	@GetMapping("/get/{account_no}/{name}/{password}")
	public Bank showBalance(@PathVariable int account_no,@PathVariable String name,@PathVariable String password)
	{
		Bank getAccount = service.getBalance(account_no, name, password);
		if(getAccount != null)
		{
			return getAccount;
		}
		else
		{
			return null;
		}
	}
	@PostMapping("/deposit/{account_no}/{name}/{password}/{amount}")
	public AmountResult depositAmount(@PathVariable int account_no,@PathVariable String name, @PathVariable String password,@PathVariable double amount)
	{
		AmountResult balance = service.depositAmount(account_no, name, password, amount);
		if(balance != null)
		{
			return balance;
		}
		else
		{
			return null;
		}
	}
	@PostMapping("/withdraw/{account_no}/{name}/{password}/{amount}")
	public AmountResult withdrawAmount(@PathVariable int account_no,@PathVariable String name, @PathVariable String password,@PathVariable double amount)
	{
		AmountResult balance = service.withdrawAmount(account_no, name, password, amount);
		if(balance != null)
		{
			return balance;
		}
		else
		{
			return null;
		}
	}
	@PostMapping("/transfer/{account_no}/{name}/{password}/{target_account}/{amount}")
	public TransferDet transferAmount(@PathVariable int account_no,@PathVariable String name,@PathVariable String password,@PathVariable int target_account,@PathVariable double amount)
	{
		TransferDet details = service.transferAmount(account_no, name, password, target_account, amount);
		if(details != null)
		{
			return details;
		}
		else
		{
			return null;
		}
	}
	@GetMapping("/close/{account_no}/{name}/{password}")
	public String closeForm(@PathVariable int account_no,@PathVariable String name,@PathVariable String password)
	{
		Bank details = service.closeAccount(account_no, name, password);
		if(details != null)
		{
			return "Account Closed Successfully...";
		}
		else
		{
			return "Account Not Closed...";
		}
		
	}


}
