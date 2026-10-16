package loopstatement;

public class CountDigits {
	public static void main(String[] args) {
		int n = 12345;
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            for (; n != 0; n /= 10) {
                count++;
            }
        }

        System.out.println("Digits = " + count);
	}

}
