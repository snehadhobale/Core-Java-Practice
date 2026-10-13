package practice;

public class AgeTicket {
	public static void main(String[] args) {
		 int age = 65;
	        double ticketPrice;

	        if (age >= 18) {
	            if (age >= 60) {
	                ticketPrice = 200 * 0.80;
	                System.out.println("Senior ticket");
	            } else {
	                ticketPrice = 200;
	                System.out.println("Normal ticket");
	            }
	        } else {
	            ticketPrice = 100;
	            System.out.println("Child ticket");
	        }

	        System.out.println("Ticket Price: Rs. " + ticketPrice);
	}		

}


