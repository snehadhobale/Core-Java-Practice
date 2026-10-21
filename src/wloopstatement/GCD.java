package wloopstatement;

public class GCD {
	public static void main(String[] args) {
		int a = 24;
        int b = 18;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("GCD = " + a);
	}

}
