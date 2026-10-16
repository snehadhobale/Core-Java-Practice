package wloopstatement;

public class SavingTarget {
	public static void main(String[] args) {
		 int savings = 1000;
	        int monthlySaving = 500;
	        int target = 5000;
	        int months = 0;

	        while (savings < target) {
	            savings += monthlySaving;
	            months++;
	        }

	        System.out.println("Months = " + months);
	        System.out.println("Total savings = ₹" + savings);
	}

}
