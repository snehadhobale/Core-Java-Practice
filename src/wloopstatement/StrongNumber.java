package wloopstatement;

public class StrongNumber {
	public static void main(String[] args) {
		int n = 145;
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int factorial = 1;
            int i = 1;

            while (i <= digit) {
                factorial *= i;
                i++;
            }

            sum += factorial;
            n /= 10;
        }

        System.out.println(sum == original
                ? "Strong number" : "Not strong");
	}

}
