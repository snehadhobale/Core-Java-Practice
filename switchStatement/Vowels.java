package switchStatement;

public class Vowels {
	public static void main(String[] args) {
		int vowels = 'a';
		
		switch(vowels) {
		case 'A','E','I','O','U','a','e','i','o','u':
			System.out.println("vowels");
		default:
			System.out.println("Conconents");
		}
	}

}
