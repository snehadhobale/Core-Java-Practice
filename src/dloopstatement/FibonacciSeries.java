package dloopstatement;

public class FibonacciSeries {
	public static void main(String[] args) {
		 int a = 0;
	        int b = 1;
	        int count = 1;

	        do {
	            System.out.print(a + " ");

	            int next = a + b;
	            a = b;
	            b = next;
	            count++;
	        } while (count <= 10);
	}

}
