package loopstatement;

public class Sum {
	public static void main(String[] args) {
		//Calculate the sum of numbers from 1 to n
		int n = 25;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
		    sum += i;
		}

		System.out.println("Sum = " + sum);
	}

}
