package wloopstatement;

public class ParticularDigit {
	public static void main(String[] args) {
		 int n = 122333;
	        int target = 3;
	        int count = 0;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit == target) {
	                count++;
	            }

	            n /= 10;
	        }

	        System.out.println("Occurrences = " + count);
	}

}
