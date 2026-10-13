package practice;

public class BillElectricity {
	public static void main(String[] args) {
		int units = 250;

        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            double bill;

            if (units <= 100) {
                bill = units * 5;
            } else if (units <= 200) {
                bill = units * 7;
            } else {
                bill = units * 10;
            }

            System.out.println("Bill: Rs. " + bill);
        }

	}

}
