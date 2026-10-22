package demo.tka;

public class Vehicle {
	
	int vehicleId;
	int year;
	int seats;
	int mileage;
    String brand;
    String model;
    String color; 
    String fuelType;
    String registrationNumber;
    String ownerName;
    String vehicleType;
    String transmission;
    String insuranceExpiry;
    String company;
    double price;

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Seats: " + seats);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Registration: " + registrationNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Transmission: " + transmission);
        System.out.println("Insurance: " + insuranceExpiry);
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
        start();
        stop();
        accelerate();
        applyBrake();
    }

    public static void start() {
        System.out.println( " started");
    }

    public static void stop() {
        System.out.println(" stopped");
    }

    public static void accelerate() {
        System.out.println(" is accelerating");
    }

    public static void applyBrake() {
        System.out.println(" brake applied");
    }
}


