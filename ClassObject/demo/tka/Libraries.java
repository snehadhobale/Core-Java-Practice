package demo.tka;

public class Libraries {
	
	int libraryId;
	int totalBooks;
	int availableBooks;
    int totalMembers;
    int totalStaff;
    String name;
    String location;
    String librarianName;
    String phone;
    String email;
    String openingTime;
    String closingTime;
    String section;
    String membershipType;
    double membershipFee;

    public void displayDetails() {
        System.out.println("Library ID: " + libraryId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Librarian: " + librarianName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Opening: " + openingTime);
        System.out.println("Closing: " + closingTime);
        System.out.println("Section: " + section);
        System.out.println("Membership: " + membershipType);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Available Books: " + availableBooks);
        System.out.println("Members: " + totalMembers);
        System.out.println("Staff: " + totalStaff);
        System.out.println("Membership Fee: " + membershipFee);
        issueBook();
        returnBook();
        registerMember();
        displayAvailableBooks();
    }

    public static void issueBook() {
            System.out.println("Book issued successfully.");
    }

    public static void returnBook() {
            System.out.println("Book returned successfully.");
    }

    public static void registerMember() {
        System.out.println("Member registered successfully.");
    }

    public static void displayAvailableBooks() {
        System.out.println("Available books ");
    }

}
