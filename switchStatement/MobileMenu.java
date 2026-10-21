package switchStatement;

public class MobileMenu {
	public static void main(String[] args) {
		int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("WiFi settings selected");
                break;
            case 2:
                System.out.println("Bluetooth settings selected");
                break;
            case 3:
                System.out.println("Mobile Data settings selected");
                break;
            case 4:
                System.out.println("Airplane Mode settings selected");
                break;
            default:
                System.out.println("Invalid setting");
        }

	}

}
