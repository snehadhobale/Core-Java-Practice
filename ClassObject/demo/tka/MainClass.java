package demo.tka;

public class MainClass {
	public static void main(String[] args) {
		

        System.out.println("--- Employee object ---");
        Employee e = new Employee();
        e.id = 201;
        e.age = 28;
        e.experience = 3;
        e.name = "Rahul";
        e.gender = "Male";
        e.designation = "Developer";
        e.department = "IT";
        e.company = "Tech Solutions";
        e.email = "rahul@example.com";
        e.phone = "9876501234";
        e.address = "Wakad";
        e.city = "Pune";
        e.joiningDate = "01-01-2024";
        e.salary = 45000;
        e.isPermanent = true;
        
        e.displayDetails();
        System.out.println("------------------------------------------------");

      
        
        System.out.println("--- Student Details ---");
        Student s = new Student();
        s.id = 101;
        s.age = 22;
        s.year = 2026;
        s.name = "Sneha";
        s.gender = "Female";
        s.course = "B.Tech";
        s.branch = "CSE";
        s.email = "sneha@example.com";
        s.phone = "9876543210";
        s.address = "Pune";
        s.city = "Pune";
        s.college = "ABC College";
        s.nationality = "Indian";
        s.percentage = 88.1;
        s.isPresent = false;

        s.displayDetails();
        System.out.println("------------------------------------------------");

    
        System.out.println("--- Hospital object ---");
        Hospital h = new Hospital();
        h.hospitalId = 1;
        h.totalBeds = 100;
        h.availableBeds = 50;
        h.totalDoctors = 25;
        h.totalNurses = 40;
        h.name = "City Hospital";
        h.location = "Pune";
        h.phone = "0201234567";
        h.email = "hospital@example.com";
        h.type = "Multispeciality";
        h.emergencyNumber = "112";
        h.directorName = "Dr. Patil";
        h.openingTime = "09:00 AM";
        h.closingTime = "09:00 PM";
        h.consultationFee = 500;

        h.displayDetails();
        System.out.println("------------------------------------------------");


        System.out.println("--- Vehicle object ---");
        Vehicle v = new Vehicle();
        v.vehicleId = 1;
        v.year = 2025;
        v.seats = 5;
        v.mileage = 18;
        v.brand = "Hyundai";
        v.model = "i20";
        v.color = "Black";
        v.fuelType = "Petrol";
        v.registrationNumber = "MH12AB1234";
        v.ownerName = "Sneha";
        v.vehicleType = "Hatchback";
        v.transmission = "Manual";
        v.insuranceExpiry = "31-12-2026";
        v.company = "Hyundai Motors";
        v.price = 900000;

        v.displayDetails();
        System.out.println("------------------------------------------------");

        System.out.println("--- Libraries object ---");
        Libraries l = new Libraries();
        l.libraryId = 1;
        l.totalBooks = 5000;
        l.availableBooks = 2500;
        l.totalMembers = 300;
        l.totalStaff = 10;
        l.name = "Central Library";
        l.location = "Pune";
        l.librarianName = "Priya";
        l.phone = "0201112223";
        l.email = "library@example.com";
        l.openingTime = "09:00 AM";
        l.closingTime = "08:00 PM";
        l.section = "Computer Science";
        l.membershipType = "Annual";
        l.membershipFee = 1000;

        l.displayDetails();
	}
	

}
