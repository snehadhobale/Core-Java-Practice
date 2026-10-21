package dloopstatement;

public class PowerOfNumber {
	public static void main(String[] args) {
		 int base = 3;
	        int exponent = 4;
	        int result = 1;
	        int i = 1;

	        do {
	            result *= base;
	            i++;
	        } while (i <= exponent);

	        System.out.println("Result = " + result);
	}

}
