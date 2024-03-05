package com.web.service;

public class TransferDetails {
	
	private int account_no;
	private double balance;
	private double tamount;
	private int tar_account;
	private double prevBalance;
	private double currentBalance;
	public TransferDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferDetails(int account_no, double balance, double tamount, int tar_account, double prevBalance,
			double currentBalance) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.tamount = tamount;
		this.tar_account = tar_account;
		this.prevBalance = prevBalance;
		this.currentBalance = currentBalance;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTamount() {
		return tamount;
	}
	public void setTamount(double tamount) {
		this.tamount = tamount;
	}
	public int getTar_account() {
		return tar_account;
	}
	public void setTar_account(int tar_account) {
		this.tar_account = tar_account;
	}
	public double getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(double prevBalance) {
		this.prevBalance = prevBalance;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	@Override
	public String toString() {
		return "TransferDetails [account_no=" + account_no + ", balance=" + balance + ", tamount=" + tamount
				+ ", tar_account=" + tar_account + ", prevBalance=" + prevBalance + ", currentBalance=" + currentBalance
				+ "]";
	}
	
	


}
