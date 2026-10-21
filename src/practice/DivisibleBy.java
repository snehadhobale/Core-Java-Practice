package practice;

public class DivisibleBy {
	public static void main(String[] args) {
		int number = 45;
		
		if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both");
        }
	}

}
