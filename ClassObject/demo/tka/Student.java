package demo.tka;

public class Student {
	
	int id;
	int age;
	int year;
    String name; 
    String gender; 
    String course;
    String branch;
    String email;
    String phone;
    String address;
    String city;
    String college;
    String nationality;
    double percentage;
    boolean isPresent;

    
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("Course: " + course);
        System.out.println("Branch: " + branch);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("College: " + college);
        System.out.println("Nationality: " + nationality);
        System.out.println("Percentage: " + percentage);
        System.out.println("Present: " + isPresent);
        study();
        attendClass();
        submitAssignment();
        displayResult();
        
        
    }

    public static void study() {
        System.out.println(" is studying");
    }

    public static void attendClass() {
        System.out.println(" is attending class");
    }

    public static void submitAssignment() {
        System.out.println(" submitted an assignment");
    }

    public static void displayResult() {
        System.out.println("Percentage: " );
    }
}


