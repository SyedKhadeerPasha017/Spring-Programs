package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.model.CustomerTable;
import com.customer.repo.CustomerRepo;


@Controller
public class CustomerController {

	@Autowired
	private CustomerRepo repo;
	
	@RequestMapping("/")
	public String registerForm()
	{
		return "register";
	}
	@RequestMapping("/register")
	public String viewCustomer(CustomerTable customer, ModelMap model)
	{
		repo.save(customer);
		return "registerStatus";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "Login";
	}
	@RequestMapping("/loginStatus")
	public String loginStatus(@RequestParam String username, @RequestParam String password,ModelMap model)
	{
		CustomerTable cust = repo.findById(username).get();
		String message =  null;
		if(username.equals(cust.getEmail()) && password.equals(cust.getPhone()))
		{
			message = "Login Successfully";
		}
		else
		{
			message = "Login Failed";
		}
		
		model.put("message", message);
		return "Success";
	}
	
	@RequestMapping("/viewCustomers")
	public String viewUsers(ModelMap model)
	{
		model.put("command", repo.findAll());
		return "viewCustomers";
	}
}

