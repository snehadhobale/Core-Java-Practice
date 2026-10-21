package dloopstatement;

public class DigitalRoot {
	public static void main(String[] args) {
		int num = 9875;

        do {
            int sum = 0;

            do {
                sum += num % 10;
                num /= 10;
            } while (num != 0);

            num = sum;
        } while (num >= 10);

        System.out.println("Digital root = " + num);
	}

}
