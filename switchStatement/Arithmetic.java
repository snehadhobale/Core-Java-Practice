package switchStatement;

public class Arithmetic {
	public static void main(String[] args) {
		int result = 2;;
		
		switch(result) {
		case 1:
			System.out.println("+");
			break;
		case 2:
			System.out.println("-");
			break;
		case 3:
			System.out.println("*");
			break;
		case 4:
			System.out.println("/");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
