package com.jbk;

public class EvenOddCounter {
	
	public void countEvenOdd(int[] arr) {
		int even = 0;
		int odd = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even Numbers: "+even);
		System.out.println("Odd Numbers: "+odd);
	}

}
