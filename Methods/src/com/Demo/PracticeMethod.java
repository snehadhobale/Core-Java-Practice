package com.Demo;

public class PracticeMethod {
	
	public void fibonacci(int n) {
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci Series :");
		
		for(int i=1;i<n;i++) {
			System.out.print(a + " ");
			
			int next = a+b;
			a = b;
			b = next;
		}
		System.out.println();		
	}
	
	public boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		
		return original == reverse;
	}
	
	public int reverseNumber(int num) {
		int reverse = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse;
	}

}
