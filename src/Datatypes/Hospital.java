
public class Hospital {
	public static void main(String[] args) {
		
		byte wardNo = 5;
		short patientAge = 45;
		int patientId = 29839;
		long contactNo = 8976543268l;
		float height = 4.9f;
		double billAmount = 45379.00;
		char gender = 'F';
		boolean isAdmitted = true;
		String patientName = "Rahul";
		String bloodGroup = "B+";
		int roomNo = 85;
		double weight = 75.50;
		
		System.out.println("Patient name is --> " + patientName);
        System.out.println("Patient age is --> " + patientAge);
        System.out.println("Patient ID is --> " + patientId);
        System.out.println("Contact number is --> " + contactNo);
        System.out.println("Height is --> " + height);
        System.out.println("Weight is --> " + weight);
        System.out.println("Bill amount is --> " + billAmount);
        System.out.println("Gender is --> " + gender);
        System.out.println("Blood group is --> " + bloodGroup);
        System.out.println("Ward number is --> " + wardNo);
        System.out.println("Room number is --> " + roomNo);
        System.out.println("Is admitted --> " + isAdmitted);
        
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