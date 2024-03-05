package com.web.service;

public class AmountResult {
	
	private double prevBalance;
	private double currentBalance;
	private double amount;
	
	public AmountResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmountResult(double prevBalance, double currentBalance, double amount) {
		super();
		this.prevBalance = prevBalance;
		this.currentBalance = currentBalance;
		this.amount = amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AmountResult [prevBalance=" + prevBalance + ", currentBalance=" + currentBalance + ", amount=" + amount
				+ "]";
	}
	
	
	

}
