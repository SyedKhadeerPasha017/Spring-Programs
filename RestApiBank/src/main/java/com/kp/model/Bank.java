package com.kp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private int account_no;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobile_no;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus status = AccountStatus.active;
	
	public enum AccountStatus
	{
		active, inactive
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int account_no, String name, String password, double amount, String address, long mobile_no,
			AccountStatus status) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile_no = mobile_no;
		this.status = status;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [account_no=" + account_no + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mobile_no=" + mobile_no + ", status=" + status + "]";
	}
	


}
