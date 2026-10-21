package wloopstatement;

public class Binary {
	public static void main(String[] args) {
		int n = 13;
        String binary = "";

        if (n == 0) {
            binary = "0";
        }

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("Binary = " + binary);
	}

}
