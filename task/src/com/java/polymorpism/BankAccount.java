package com.java.polymorpism;

public class BankAccount {

	public double balance;

	public void accbalance(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}
    // method overloading
	public void accbalance(double amount, String message) {
		balance += amount;
		System.out.println(message + " Amount: " + amount);
	}
	
	@Override
	public void accbalance(double amount) {
		balance = balance-amount;
		System.out.println("");
	}

	public void calculateInterest() {
		System.out.println("General interest rate: 4%");
	}

}
