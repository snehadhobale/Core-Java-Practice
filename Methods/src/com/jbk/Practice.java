package com.jbk;

public class Practice {
	
	 // 1. Void method without parameters
    public void greet() {
        System.out.println("Hello, Java!");
    }

    // 2. Void method with int parameter
    public void displayAge(int age) {
        System.out.println("Age: " + age);
    }

    // 3. Method returning int
    public int getNumber() {
        return 100;
    }

	 // 4. Method returning square
    public int square(int n) {
        return n * n;
    }

    // 5. Void method with String parameter
    public void displayName(String name) {
        System.out.println("Name: " + name);
    }

    // 6. Method returning char
    public char getGrade() {
        return 'A';
    }

    // 7. Method returning boolean
    public boolean isJavaEasy() {
        return true;
    }

    // 8. Method returning double
    public double getPrice() {
        return 99.99;
    }

    // 9. Void method with two parameters
    public void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 10. Method returning String
    public String getMessage(String name) {
        return "Hello, " + name;
    }

    // 11. byte parameters, int return type
    public int add(byte a, byte b) {
        return a + b;
    }

    // 12. Method returning short
    public short getSmallNumber() {
        return 250;
    }

    // 13. Method returning long
    public long calculateTotal(long a, long b) {
        return a + b;
    }

    // 14. Method returning float
    public float calculateAverage(float a, float b) {
        return (a + b) / 2.0f;
    }

    // 15. Method returning double
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0.0;
        }
        return a / b;
    }

    // 16. Void method printing product
    public void printProduct(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    // 17. Method returning first character
    public char getFirstLetter(String name) {
        return name.charAt(0);
    }

    // 18. Method checking even number
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 19. Method converting int to double
    public double convertToDouble(int n) {
        return n;
    }

    // 20. Void method with different parameters
    public void displayDetails(
            String name, int age, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // 21. Method returning greater number
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 22. Method calculating factorial
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number cannot be negative");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // 23. Method checking positive number
    public boolean isPositive(int n) {
        return n > 0;
    }

    // 24. Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    // 25. Void method printing multiplication table
    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                n + " x " + i + " = " + (n * i));
        }
    }

    // 26. Method counting digits in an integer
    public int countDigits(int n) {
        long number = Math.abs((long) n);
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }

    // 27. Method returning initial
    public char getInitial(String firstName) {
        return firstName.charAt(0);
    }

    // 28. Method calculating rectangle area
    public double calculateArea(
            double length, double width) {
        return length * width;
    }

    // 29. Method checking eligibility
    public boolean isEligible(int age) {
        return age >= 18;
    }

    // 30. Void method with mixed data types
    public void displayStudent(
            String name, int rollNo,
            char grade, boolean passed) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
    }


}
