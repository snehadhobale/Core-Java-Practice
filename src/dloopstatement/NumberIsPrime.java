package dloopstatement;

public class NumberIsPrime {
	public static void main(String[] args) {
		int num = 17;
        int i = 2;
        boolean prime = num > 1;

        do {
            if (num % i == 0) {
                prime = false;
                break;
            }

            i++;
        } while (i <= num / 2);

        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
	}

}
