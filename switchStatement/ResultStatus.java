package switchStatement;

public class ResultStatus {
	public static void main(String[] args) {
		int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Pass");
                break;
            case 2:
                System.out.println("Distinction");
                break;
            case 3:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid result category");
        }

	}

}
