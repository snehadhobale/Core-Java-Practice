package wloopstatement;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 7;
        int count = 0;
        int a = 0;
        int b = 1;

        while (count < n) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
            count++;
        }
	}

}
