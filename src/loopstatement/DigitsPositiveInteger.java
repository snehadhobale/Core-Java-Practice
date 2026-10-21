package loopstatement;

public class DigitsPositiveInteger {
	public static void main(String[] args) {
		int n = 1234;
        int reverse = 0;

        for (; n > 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reverse = " + reverse);
	
}

}
