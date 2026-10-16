package loopstatement;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum = " + sum);
	}

}
