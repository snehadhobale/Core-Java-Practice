package switchStatement;

public class Department {
	public static void main(String[] args) {
		 int code = 2;

	        switch (code) {
	            case 1:
	                System.out.println("Computer Science");
	                break;
	            case 2:
	                System.out.println("Mechanical Engineering");
	                break;
	            case 3:
	                System.out.println("Civil Engineering");
	                break;
	            case 4:
	                System.out.println("Electrical Engineering");
	                break;
	            default:
	                System.out.println("Invalid department code");
	        }
	}

}
