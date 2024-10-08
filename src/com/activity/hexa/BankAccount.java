package com.activity.hexa;

public class BankAccount {
	
	    private double balance;

	    public BankAccount(double initialDeposit) throws InvalidAmountException {
	        if (initialDeposit < 0) {
	            throw new InvalidAmountException("Initial deposit cannot be negative.");
	        }
	        this.balance = initialDeposit;
	    }

	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be greater than zero.");
	        }
	        balance += amount;
	        System.out.println("Deposit successful. Current balance: " + balance);
	    }

	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful. Current balance: " + balance);
	    }

	    public double getBalance() {
	        return balance;
	    }
	}


