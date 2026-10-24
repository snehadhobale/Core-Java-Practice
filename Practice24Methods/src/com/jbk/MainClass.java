package com.jbk;

public class MainClass {
	public static void main(String[] args) {
		AtmSystem a1 = new AtmSystem();
		a1.checkbalance();
		a1.withdrawAmount(7000);
		
		System.out.println("--------------------------------------------------");
		
		StudentResult s1 = new StudentResult();
		double percentage = s1.calculatePercentage(85, 79, 99);
		System.out.println("Percentage : "+ percentage +"%");
		
		System.out.println("--------------------------------------------------");
		
		MobileRecharge m1 = new MobileRecharge();
		m1.recharge(899);
		
		System.out.println("--------------------------------------------------");
		
		TemperatureConverter t1 =new TemperatureConverter();
		System.out.println(t1.celcisusToFahrenheit(25)+ "F");
		
		System.out.println("--------------------------------------------------");
		
		LoginSystem l = new LoginSystem();
		if (l.login("admin", "java123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
		
		System.out.println("--------------------------------------------------");
		
		EcommerceDisc e = new EcommerceDisc();
		System.out.println("Final price: Rs. " + e.calculateDiscount(1000));
		
		System.out.println("--------------------------------------------------");
		
		 EmployeeSalary e1 = new EmployeeSalary();
	     System.out.println("Total salary: Rs. " + e1.calculateSalary(20000));		
		
		System.out.println("--------------------------------------------------");
		
		 BankInterest b = new BankInterest();
	     System.out.println("Interest: Rs. "+ b.calculateInterest(10000, 5, 2));
				
		System.out.println("--------------------------------------------------");
		
		FoodOrdering f = new FoodOrdering();
        f.placeOrder("Pizza", 2);
				
		System.out.println("--------------------------------------------------");
		
		ElectricityBill e2 = new ElectricityBill();
        System.out.println("Bill: Rs. " + e2.calculateBill(100));
        
		System.out.println("--------------------------------------------------");
		
		VotingSystem v = new VotingSystem();
        v.vote(20);
        
		System.out.println("--------------------------------------------------");
		
		RideBooking r = new RideBooking();
	    System.out.println("Fare: Rs. " + r.calculateFare(10));
		
		System.out.println("--------------------------------------------------");
		
		PasswordChecker p = new PasswordChecker();
        System.out.println(p.checkPassword("Java@123"));
		
		System.out.println("--------------------------------------------------");
		
		LibrarySystem l1 = new LibrarySystem();
	    l1.issueBook("Java Programming", true);
		
		System.out.println("--------------------------------------------------");
		
        ShoppingCart s = new ShoppingCart();
        System.out.println("Total: Rs. "+ s.calculateTotal(100, 200, 300));
        
        System.out.println("--------------------------------------------------");
        
        MaximumNumber m = new MaximumNumber();
        System.out.println("Maximum : "+m.findMax(90, 80, 99));
        
        System.out.println("--------------------------------------------------");
        
        PrimeChecker p1 = new PrimeChecker();
        System.out.println(p1.isPrime(7));
        System.out.println(p1.isPrime(91));

        System.out.println("--------------------------------------------------");
        
        PalindromeChecker pal = new PalindromeChecker();
        System.out.println(pal.isPalindrome(161));
        System.out.println(pal.isPalindrome(444));
        
        System.out.println("--------------------------------------------------");
        
        EvenOddCounter e3 = new EvenOddCounter();
        int[] arr = {98,79,23,45,43};
        e3.countEvenOdd(arr);
          
        System.out.println("--------------------------------------------------");
        
        GradeCalculator g = new GradeCalculator();
        System.out.println(g.getGrade(45));
        System.out.println(g.getGrade(99));
        System.out.println(g.getGrade(55));
        System.out.println(g.getGrade(75));
        System.out.println(g.getGrade(80));
        System.out.println(g.getGrade(20));
        
	}

}
