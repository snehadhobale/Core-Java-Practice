package wloopstatement;

public class PowerOf2 {
	public static void main(String[] args) {
		int n = 64;

        if (n <= 0) {
            System.out.println("Not a power of 2");
            return;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        System.out.println(n == 1
                ? "Power of 2" : "Not a power of 2");
	}

}
