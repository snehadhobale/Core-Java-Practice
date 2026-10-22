package demo.tka;

public class Hospital {
	int hospitalId;
	int totalBeds;
	int availableBeds;
    int totalDoctors;
    int totalNurses;
    String name;
    String location;
    String phone;
    String email;
    String type;
    String emergencyNumber;
    String directorName;
    String openingTime;
    String closingTime;
    double consultationFee;

   
    public void displayDetails() {
        System.out.println("Hospital ID: " + hospitalId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Type: " + type);
        System.out.println("Emergency: " + emergencyNumber);
        System.out.println("Director: " + directorName);
        System.out.println("Opening: " + openingTime);
        System.out.println("Closing: " + closingTime);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Available Beds: " + availableBeds);
        System.out.println("Doctors: " + totalDoctors);
        System.out.println("Nurses: " + totalNurses);
        System.out.println("Consultation Fee: " + consultationFee);
        admitPatient();
        dischargePatient();
        treatPatient();
        displayAvailableBeds();   
        
        }

    public static void admitPatient() {
        System.out.println("Patient admitted");
    }

    public static void dischargePatient() {
            System.out.println("Patient discharged"); 
    }

    public static void treatPatient() {
        System.out.println(" is treating a patient.");
    }

    public static void displayAvailableBeds() {
        System.out.println("Available beds ");
    }

}
