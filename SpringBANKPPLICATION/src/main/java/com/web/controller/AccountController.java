package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entity.Account;
import com.web.service.AmountResult;
import com.web.service.TransferDetails;
import com.web.service.AccountServiceImp;

@Controller
public class AccountController {

	@Autowired
	private AccountServiceImp service;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/addAccount")
	public String accountForm()
	{
		return "addAccount";
	}
	@RequestMapping("/register")
	public String saveAccount(Account account)
	{
		Account a = service.saveAccount(account);
		return "success";
	}
	@RequestMapping("/balance")
	public String balanceForm(Account account)
	{
		return "balanceForm";
	}
	@RequestMapping("/accountbalance")
	public String showBalance(@RequestParam int account_no, @RequestParam String name,@RequestParam String password,ModelMap model)
	{
		Account getAcc = service.getBalance(account_no,name,password);
		
		if(getAcc != null)
		{
			model.put("details", getAcc);
			return "showBalance";
		}
		else
		{
			return "redirect:/balance";
		}
	}
	@RequestMapping("/deposit")
	public String depositForm()
	{
		return "depositForm";
	}
	@RequestMapping("/accountdeposit")
	public String depositAmount(@RequestParam int account_no,@RequestParam String name,@RequestParam String password,@RequestParam double amount,ModelMap model)
	{
		AmountResult balance = service.depositAmount(account_no,name,password,amount);
		if(balance != null)
		{
			model.put("deposit", balance);
			return "showDeposit";
		}
		else
		{
			return "redirect:/deposit";
		}
	}
	@RequestMapping("/withdraw")
	public String withdrawForm()
	{
		return "withdrawForm";
	}
	@RequestMapping("/withdrawAmount")
	public String withdrawAmount(@RequestParam int account_no,@RequestParam String name,@RequestParam String password,@RequestParam double amount,ModelMap model)
	{
		AmountResult balance = service.withdrawAmount(account_no,name,password,amount);
		if(balance != null)
		{
			model.put("withdraw", balance);
			return "showWithdraw";
		}
		else
		{
			return "redirect:/withdraw";
		}
	}
	@RequestMapping("/transfer")
	public String transferForm()
	{
		return "transferForm";
	}
	@RequestMapping("/transferAmount")
	public String transferAmount(@RequestParam int account_no,@RequestParam String name, @RequestParam String password, @RequestParam int targetAccount, @RequestParam double amount,ModelMap model)
	{
		TransferDetails account = service.transferAmount(account_no,name,password,targetAccount,amount);
		if(account != null)
		{
			model.put("account", account);
			return "showTransfer";
		}
		else
		{
			return "redirect:/transferForm";
		}
	}
	
	@RequestMapping("/close")
	public String closeForm()
	{
		return "closingForm";
	}
	@RequestMapping("/closeAccount")
	public String closeAccount(@RequestParam int account_no,@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		Account details = service.closeAccount(account_no, name, password);
		if(details != null)
		{
			model.put("details",details);
			return "showStatus";
		}
		else
		{
			return "showStatus";
		}
	}
	
	
}
