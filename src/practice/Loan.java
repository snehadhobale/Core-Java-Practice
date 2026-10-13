package practice;

public class Loan {
	public static void main(String[] args) {
		int age = 24;
        double salary = 30000;

        if (age >= 21) {
            if (salary >= 25000) {
                System.out.println("Loan eligible");
            } else {
                System.out.println("Salary criteria not met");
            }
        } else {
            System.out.println("Age criteria not met");
        }

	
}

}
