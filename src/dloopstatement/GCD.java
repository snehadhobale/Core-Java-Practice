package dloopstatement;

public class GCD {
	public static void main(String[] args) {
		int a = 48;
        int b = 18;

        do {
            int remainder = a % b;
            a = b;
            b = remainder;
        } while (b != 0);

        System.out.println("GCD = " + a);
	}

}
