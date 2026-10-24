package com.jbk;

public class AtmSystem {
	
	double balance = 85000;
	
	public void checkbalance() {
		System.out.println("account balance");
	}
	
	public void withdrawAmount(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw successful");
			System.out.println("remaining balance "+balance);
		}else {
			System.out.println("Invalid Amount");
		}
	}

}
