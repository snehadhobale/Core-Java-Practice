package wloopstatement;

public class TargetScore {
	public static void main(String[] args) {
		int score = 0;
        int attempts = 0;

        while (score < 50) {
            score += 12;
            attempts++;
        }

        System.out.println("Final score = " + score);
        System.out.println("Attempts = " + attempts);
	}

}
