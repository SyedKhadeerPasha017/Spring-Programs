package com.kp.model;

public class AmountResult {
	
	private double previous_Balance;
	private double current_Balance;
	private double transaction_amount;
	public AmountResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmountResult(double previous_Balance, double current_Balance, double transaction_amount) {
		super();
		this.previous_Balance = previous_Balance;
		this.current_Balance = current_Balance;
		this.transaction_amount = transaction_amount;
	}
	public double getPrevious_Balance() {
		return previous_Balance;
	}
	public void setPrevious_Balance(double previous_Balance) {
		this.previous_Balance = previous_Balance;
	}
	public double getCurrent_Balance() {
		return current_Balance;
	}
	public void setCurrent_Balance(double current_Balance) {
		this.current_Balance = current_Balance;
	}
	public double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	@Override
	public String toString() {
		return "AmountResult [previous_Balance=" + previous_Balance + ", current_Balance=" + current_Balance
				+ ", transaction_amount=" + transaction_amount + "]";
	}
	


}
