package wloopstatement;

public class IntegerToBinary {
	public static void main(String[] args) {
		int n = 13;
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("Binary = " + binary);
	}

}
