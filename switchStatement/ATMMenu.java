package switchStatement;

public class ATMMenu {
	public static void main(String[] args) {
		int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Check Balance");
                break;

            case 2:
                System.out.print("withdrawal");
                break;

            case 3:
                System.out.print("deposit");
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }

	}

}
