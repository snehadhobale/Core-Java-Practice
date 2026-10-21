package practice;

public class OnlineShopping {
	public static void main(String[] args) {
		double amount = 2000;
        String membership = "yes";
        double discount = 0;

        if (amount > 1000) {
            if (membership.equalsIgnoreCase("yes")) {
                discount = amount * 0.20;
            } else {
                discount = amount * 0.10;
            }
        } else {
            discount = 0;
        }

        double finalAmount = amount - discount;

        System.out.println("Purchase Amount: Rs. " + amount);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + finalAmount);

	}

}
