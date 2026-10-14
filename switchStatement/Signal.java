package switchStatement;

public class Signal {
	public static void main(String[] args) {
		String clr = "Red";

		switch (clr) {
		case "Red":
			System.out.println("Stop ... ! ");
			break;
		case "Yellow":
			System.out.println("Ready to Go ... !");
			break;
		case "Green":
			System.out.println("Go ... !");
			break;

		default:
			System.out.println("Invalid Input ... !");
		}
	}
}
