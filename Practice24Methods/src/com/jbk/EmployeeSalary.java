package com.jbk;

public class EmployeeSalary {
	
	   public double calculateSalary(double basic) {
	        double hra = basic * 20 / 100;
	        double da = basic * 10 / 100;

	        return basic + hra + da;
	    }
}
