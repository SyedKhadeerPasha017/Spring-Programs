package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Account;
import com.web.entity.Account.AccountStatus;
import com.web.service.AmountResult;
import com.web.service.TransferDetails;
import com.web.repo.AccountRepo;

@Service
public class AccountServiceImp implements AccountService {

	@Autowired
	private AccountRepo repo;
	
	@Override
	public Account saveAccount(Account account) {
		Account save = repo.save(account);
		return save;
	}

	@Override
	public Account getBalance(int account_no,String name,String password) {
		
		Account getAccount = repo.findById(account_no).get();
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
	public AmountResult depositAmount(int account_no,String name,String password,double amount) {
		
		Account getAccount = repo.findById(account_no).get();
		if(account_no == getAccount.getAccount_no() && name.equals(getAccount.getName()) && password.equals(getAccount.getPassword()))
		{
			double prevBalance = getAccount.getAmount();
			double currentBalance = prevBalance + amount;
			getAccount.setAmount(currentBalance);
			repo.save(getAccount);
			
			AmountResult deposit = new AmountResult();
			deposit.setPrevBalance(prevBalance);
			deposit.setAmount(amount);
			deposit.setCurrentBalance(currentBalance);
			return deposit;
		}
		else
		{
		return null;
		}
	}

	@Override
	public AmountResult withdrawAmount(int account_no,String name,String password,double amount) {
		Account getAccount = repo.findById(account_no).get();
		if(account_no == getAccount.getAccount_no() && name.equals(getAccount.getName()) && password.equals(getAccount.getPassword()) && amount < getAccount.getAmount())
		{
			double prevBalance = getAccount.getAmount();
			double currentBalance = prevBalance - amount;
			getAccount.setAmount(currentBalance);
			repo.save(getAccount);
			
			AmountResult withdraw = new AmountResult();
			withdraw.setPrevBalance(prevBalance);
			withdraw.setAmount(amount);
			withdraw.setCurrentBalance(currentBalance);
			return withdraw;
		}
		else
		{
			return null;
		}
	}

	@Override
	public TransferDetails transferAmount(int account_no,String name,String password,int targetAccount,double amount) {
		Account caccount = repo.findById(account_no).get();
		Account taccount = repo.findById(targetAccount).get();
		if(account_no == caccount.getAccount_no() && name.equals(caccount.getName()) && password.equals(caccount.getPassword()) && targetAccount == taccount.getAccount_no() && amount < caccount.getAmount())
		{
			TransferDetails account = new TransferDetails();
			double prevBalance = caccount.getAmount();
			double curBalance = prevBalance - amount;
			caccount.setAmount(curBalance);
			repo.save(caccount);
			account.setAccount_no(account_no);
			account.setBalance(prevBalance);
			account.setTamount(amount);
			
			double previousBalance = taccount.getAmount();
			double currentBalance = previousBalance + amount;
			taccount.setAmount(currentBalance);
			repo.save(taccount);
			account.setTar_account(targetAccount);
			account.setPrevBalance(previousBalance);
			account.setCurrentBalance(currentBalance);
			
			return account;	
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public Account closeAccount(int account_no,String name,String password) {
		Account details = repo.findById(account_no).get();
		if(details != null && account_no == details.getAccount_no() && name.equals(details.getName()) && password.equals(details.getPassword()))
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
