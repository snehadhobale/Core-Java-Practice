package dloopstatement;

public class EvenDigti {
	public static void main(String[] args) {
		 int num = 24831;
	        int count = 0;

	        do {
	            int digit = num % 10;

	            if (digit % 2 == 0) {
	                count++;
	            }

	            num /= 10;
	        } while (num != 0);

	        System.out.println("Even digits = " + count);
	}

}
