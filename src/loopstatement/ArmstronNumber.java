package loopstatement;

public class ArmstronNumber {
	public static void main(String[] args) {
		int n = 153;
        int original = n;
        int digits = 0;
        int sum = 0;

        for (int temp = n; temp > 0; temp /= 10) {
            digits++;
        }

        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int power = 1;

            for (int j = 1; j <= digits; j++) {
                power *= digit;
            }

            sum += power;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
	}

}
