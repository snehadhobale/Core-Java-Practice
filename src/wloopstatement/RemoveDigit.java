package wloopstatement;

public class RemoveDigit {
	public static void main(String[] args) {
		 int n = 120302;
	        int target = 2;
	        int result = 0;
	        int place = 1;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit != target) {
	                result += digit * place;
	                place *= 10;
	            }

	            n /= 10;
	        }

	        System.out.println("Result = " + result);
	}

}
