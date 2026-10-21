package dloopstatement;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
        int original = num;
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        } while (num != 0);

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
	}

}
