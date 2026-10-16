package wloopstatement;

public class MultipleOf {
	public static void main(String[] args) {
		 int n = 50;
	        int candidate = n + 1;

	        while (candidate % 9 != 0) {
	            candidate++;
	        }

	        System.out.println("First multiple = " + candidate);
	}

}
