package com.training.domain;

import java.security.InvalidParameterException;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private long balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public BankAccount(int accountNumber, String accountHolderName, long balance) {
		super();
		if (accountHolderName != null)
			this.accountHolderName = accountHolderName;
		else
			throw new InvalidParameterException();
		this.accountNumber = accountNumber;

		this.balance = balance;
	}

	public long deposite(long amountDeposited) {
		balance += amountDeposited;
		return balance;
	}

	public long withDraw(long amountWithdrawn) {
		if (balance - amountWithdrawn > 0) {
			balance -= amountWithdrawn;
			return balance;
		} else
			throw new IllegalArgumentException("Balance cannot be negative.\n");
	}

}
