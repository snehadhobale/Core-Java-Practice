package switchStatement;

public class EvenOdd {
	public static void main(String[] args) {
		int num = 6;
		
		switch(num % 2) {
		case 0:
			System.out.println("Even Number");
			break;
		default:
			System.out.println("Odd Number");
		}
	}

}
