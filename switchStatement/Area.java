package switchStatement;

public class Area {
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("Circle");
			break;
		case 2:
			System.out.println("Rectangle");
			break;
		case 3:
			System.out.println("Square");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
