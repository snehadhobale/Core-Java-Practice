
public class Vehicle {
	public static void main(String[] args) {
		
		byte gears = 5;
		short modelYear = 2024;
		int vehicleNo = 5675;
		long registrationNo = 9876545678909l;
		float mileage = 18.5f;
		double price = 850000.74;
		char category = 'S';
		boolean isElectric = false;
		String brand = "Toyota";
		String color = "white";
		int engineCC = 1498;
		double fuelCapacity = 45.5;
		
		System.out.println("Vehicle brand is --> " + brand);
		System.out.println("Color is --> " + color);
	    System.out.println("Number of gears --> " + gears);
	    System.out.println("Model year is --> " + modelYear);
	    System.out.println("Vehicle number is --> " + vehicleNo);
	    System.out.println("Registration number is --> " + registrationNo);
	    System.out.println("Mileage is --> " + mileage);
	    System.out.println("Price is --> " + price);
	    System.out.println("Category is --> " + category);
	    System.out.println("Is electric --> " + isElectric);
	    System.out.println("Engine CC is --> " + engineCC);
	    System.out.println("Fuel capacity is --> " + fuelCapacity);
	    
	    System.out.println();
		System.out.println();
		
		//size into bytes
		
		System.out.println("Byte is -->" + Byte.BYTES + " " + "byte");
		System.out.println("Short is -->" + Short.BYTES + " "+ "byte");
		System.out.println("Integer is -->" + Integer.BYTES +" " + "byte");
		System.out.println("Long is -->" + Long.BYTES + " " +"byte");
		System.out.println("Float is -->" + Float.BYTES + " " +"byte");
		System.out.println("Character is -->" + Character.BYTES +" " + "byte");
		
		System.out.println();
		System.out.println();
		
		//size into bites
		
		System.out.println("Byte is -->" + Byte.SIZE + " " + "bits");
		System.out.println("Short is -->" + Short.SIZE + " "+ "bits");
		System.out.println("Integer is -->" + Integer.SIZE +" " + "bits");
		System.out.println("Long is -->" + Long.SIZE + " " +"bits");
		System.out.println("Float is -->" + Float.SIZE + " " +"bits");
		System.out.println("Character is -->" + Character.SIZE +" " + "bits");
		  
	    }
	}
		
		 