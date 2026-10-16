package loopstatement;

public class Palindrome {
	public static void main(String[] args) {
		int n = 121;
        int original = n;
        int reverse = 0;

        for (int temp = n; temp > 0; temp /= 10) {
            reverse = reverse * 10 + temp % 10;
        }

        if (original >= 0 && original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
	} 

}
