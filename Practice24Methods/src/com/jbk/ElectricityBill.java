package com.jbk;

public class ElectricityBill {
	
	    public double calculateBill(int units) {
	        if (units < 0) {
	            return -1;
	        }

	        return units * 5.0;
	    }

	}


