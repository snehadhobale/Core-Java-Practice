package switchStatement;

public class SeasonFinder {
	public static void main(String[] args) {
		int month = 7;

        switch (month) {
            case 12,1,2:
                System.out.println("Winter");
                break;

            case 3,4,5:
                System.out.println("Summer");
                break;

            case 6,7,8:
                System.out.println("Monsoon");
                break;

            case 9,10,11:
                System.out.println("Autumn / Post-monsoon");
                break;

            default:
                System.out.println("Invalid month number");
        }
	}

}
