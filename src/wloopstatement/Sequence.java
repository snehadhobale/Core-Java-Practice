package wloopstatement;

public class Sequence {
	public static void main(String[] args) {
		long n = 7;

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        System.out.println(1);
	}

}
