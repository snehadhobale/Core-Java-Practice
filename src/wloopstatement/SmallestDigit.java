package wloopstatement;

public class SmallestDigit {
	public static void main(String[] args) {
		 int n = 58327;
	        n = Math.abs(n);
	        int smallest = 9;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit < smallest) {
	                smallest = digit;
	            }

	            n /= 10;
	        }

	        System.out.println("Smallest digit = " + smallest);
	}

}
