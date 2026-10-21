package practice;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 150;
        double bill;

        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            if (units <= 100) {
                bill = units * 5;
            } else if (units <= 200) {
                bill = units * 7;
            } else {
                bill = units * 10;
            }

            if (units >= 0) {
                System.out.println("Bill: Rs. " +
                    (units <= 100 ? units * 5 :
                    units <= 200 ? units * 7 :
                    units * 10));
            }
        }

	}

}
