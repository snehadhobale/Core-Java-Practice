package com.jbk;

public class MainClass {
	public static void main(String[] args) {
		
			Practice p1 = new Practice();
	        p1.greet();
	        p1.displayAge(23);
	        System.out.println("Number: " + p1.getNumber());
	        System.out.println("Square: " + p1.square(5));
	        p1.displayName("Sneha");
	        System.out.println("Grade: " + p1.getGrade());
	        System.out.println("Java is easy: " + p1.isJavaEasy());
	        System.out.println("Price: " + p1.getPrice());
	        p1.printSum(10, 20);
	        System.out.println(p1.getMessage("Sneha"));

	        byte a = 10;
	        byte b = 20;
	        System.out.println("Byte sum: " + p1.add(a, b));

	        System.out.println("Small number: " + p1.getSmallNumber());
	        System.out.println("Total: " + p1.calculateTotal(100L, 200L));
	        System.out.println("Average: " + p1.calculateAverage(10.0f, 20.0f));
	        System.out.println("Division: " + p1.divide(20.0, 4.0));
	        p1.printProduct(5, 4);
	        System.out.println("First letter: " + p1.getFirstLetter("Java"));
	        System.out.println("Is even: " + p1.isEven(8));
	        System.out.println("Converted value: " + p1.convertToDouble(50));

	        p1.displayDetails("Sneha", 23, 25000.50);

	        System.out.println("Maximum: " + p1.max(15, 25));
	        System.out.println("Factorial: " + p1.factorial(5));
	        System.out.println("Is positive: " + p1.isPositive(10));
	        System.out.println("Fahrenheit: " + p1.celsiusToFahrenheit(25));

	        p1.printTable(5);

	        System.out.println("Digit count: " + p1.countDigits(12345));
	        System.out.println("Initial: " + p1.getInitial("Sneha"));
	        System.out.println("Rectangle area: " + p1.calculateArea(5.0, 4.0));
	        System.out.println("Eligible: " + p1.isEligible(20));

	        p1.displayStudent("Sneha", 101, 'A', true);
	    }
	
	}


