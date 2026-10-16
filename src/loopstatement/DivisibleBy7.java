package loopstatement;

public class DivisibleBy7 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=0;i<100;i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
