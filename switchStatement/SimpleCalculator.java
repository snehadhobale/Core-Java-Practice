package switchStatement;

public class SimpleCalculator {
	public static void main(String[] args) {
		int result =
				2;
		
		switch(result) {
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multplication");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Invalid");
		
		}
	}

}
