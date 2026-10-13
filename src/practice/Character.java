package practice;

public class Character {
	public static void main(String[] args) {
		char ch = '@';
		
		 if ((ch >= 'A' && ch <= 'Z') ||
		            (ch >= 'a' && ch <= 'z')) {

		            if (ch == 'a' || ch == 'e' ||
		                ch == 'i' || ch == 'o' ||
		                ch == 'u' || ch == 'A' ||
		                ch == 'E' || ch == 'I' ||
		                ch == 'O' || ch == 'U') {
		                System.out.println("Vowel");
		            } else {
		                System.out.println("Consonant");
		            }

		        } else if (ch >= '0' && ch <= '9') {
		            System.out.println("Digit");
		        } else {
		            System.out.println("Special character");
		        }

	}

}
