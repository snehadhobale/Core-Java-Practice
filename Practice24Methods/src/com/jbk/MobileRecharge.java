package com.jbk;

public class MobileRecharge {
	
	public void recharge(double amount) {
		if(amount > 0) {
			System.out.println("Recharge Successful :"+amount);
		}else {
			System.out.println("Invalid Recharge amount");
		}
	}

}
