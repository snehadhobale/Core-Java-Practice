package switchStatement;

public class FoodMenu {
	public static void main(String[] args) {
		int choice = 6;

        switch (choice) {
            case 1:
                System.out.println("You selected Pizza");
                break;
            case 2:
                System.out.println("You selected Burger");
                break;
            case 3:
                System.out.println("You selected Sandwich");
                break;
            case 4:
                System.out.println("You selected Pasta");
                break;
            default:
                System.out.println("Invalid food choice");
        }
	}

}
