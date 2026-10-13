package practicequestions;

public class Voting {
	public static void main(String[] args) {
		int age = 24;
		
		if(age >= 18) {
			System.out.println("Eligible for voting");
			if(age > 25) {
				System.out.println("Eligible for contest");
			}else {
				System.out.println("Not Eligible for contest");
			}
		}else {
			System.out.println("Not Eligible for voting");
		}
	}

}
