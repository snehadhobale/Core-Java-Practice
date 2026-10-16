package wloopstatement;

public class SumOfSquare {
	public static void main(String[] args) {
		 int n = 5;
	        int i = 1;
	        int sum = 0;

	        while (i <= n) {
	            sum += i * i;
	            i++;
	        }

	        System.out.println("Sum of squares = " + sum);
		
	}

}
