package demo.tka;

public class Employee {

    int id; 
    int age;
    int experience;
    String name;
    String gender;
    String designation;
    String department; 
    String company;
    String email; 
    String phone; 
    String address; 
    String city;
    String joiningDate;
    double salary;
    boolean isPermanent;

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Company: " + company);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        work();
        attendMeeting();
        calculateSalary();
        applyLeave();
    }

    public static void work() {
        System.out.println(" is working");
    }

    public static void attendMeeting() {
        System.out.println(" is attending a meeting");
    }

    public static void calculateSalary() {
        System.out.println("Salary: Rs. ");
    }

    void applyLeave() {
        System.out.println(" applied for leave");
    }
}



