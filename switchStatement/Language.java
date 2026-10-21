package switchStatement;

public class Language {
	public static void main(String[] args) {
		int code = 2;
		
		switch(code) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("Python");
			break;
		case 3:
			System.out.println("c++");
			break;
		case 4:
			System.out.println("Javascript");
			break;
		default:
			System.out.println("Invalid");
			
		}
	}

}
