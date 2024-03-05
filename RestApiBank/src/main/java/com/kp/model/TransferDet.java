package com.kp.model;

public class TransferDet {
	
	private int account_no;
	private double balance;
	private double transaction_amount;
	private int target_account;
	private double previous_Balance;
	private double current_Balance;
	public TransferDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferDet(int account_no, double balance, double transaction_amount, int target_account,
			double previous_Balance, double current_Balance) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.transaction_amount = transaction_amount;
		this.target_account = target_account;
		this.previous_Balance = previous_Balance;
		this.current_Balance = current_Balance;
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
	public double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public int getTarget_account() {
		return target_account;
	}
	public void setTarget_account(int target_account) {
		this.target_account = target_account;
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
	@Override
	public String toString() {
		return "TransferDet [account_no=" + account_no + ", balance=" + balance + ", transaction_amount="
				+ transaction_amount + ", target_account=" + target_account + ", previous_Balance=" + previous_Balance
				+ ", current_Balance=" + current_Balance + "]";
	}
	

}
