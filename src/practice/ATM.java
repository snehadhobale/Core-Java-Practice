package practice;

public class ATM {
	public static void main(String[] args) {
		double balance = 5000;
        int amount = 1200;

        if (amount > 0) {
            if (balance >= amount) {
                if (amount % 100 == 0) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Invalid denomination");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }

	}

}
