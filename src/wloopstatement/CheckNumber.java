package wloopstatement;

public class CheckNumber {
	public static void main(String[] args) {
		 int n = 18;
	        int temp = n;
	        int sum = 0;

	        while (temp > 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }

	        if (n > 0 && n % sum == 0) {
	            System.out.println("Harshad number");
	        } else {
	            System.out.println("Not a Harshad number");
	        }
	}

}
