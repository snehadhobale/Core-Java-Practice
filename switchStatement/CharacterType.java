package switchStatement;

public class CharacterType {
	public static void main(String[] args) {
		char ch = 2;

        switch (Character.getType(ch)) {
            case 1:
                System.out.println("Uppercase letter");
                break;

            case 2:
                System.out.println("Lowercase letter");
                break;

            case 3:
                System.out.println("Digit");
                break;

            default:
                System.out.println("Special character or other character type");
        }

	}

}
