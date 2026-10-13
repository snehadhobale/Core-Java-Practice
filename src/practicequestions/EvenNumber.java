package practicequestions;

public class EvenNumber {
	public static void main(String[] args) {
		int even = 44;
		
		if(even % 2 == 0) {
			System.out.println("This is Even Number");
			if(even >= 50) {
				System.out.println("Number should be greater than 50");
			}else {
				System.out.println("Number is n greater than 50");
			}
		}else {
			System.out.println("This is not even number");
		}
	}

}
