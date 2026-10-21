package loopstatement;

public class PowerOfNumber {
	public static void main(String[] args) {
		 int a = 2;
	        int b = 5;
	        long result = 1;

	        for (int i = 1; i <= b; i++) {
	            result *= a;
	        }

	        System.out.println("Result = " + result);
	} 

}
