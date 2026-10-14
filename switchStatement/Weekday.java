package switchStatement;

public class Weekday {
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1,2,3,4,5:
			System.out.println("Weekdays");
			break;
		case 6,7:
			System.out.println("Weekend");
		default:
			System.out.println("Working");
		
		}
	}

}
