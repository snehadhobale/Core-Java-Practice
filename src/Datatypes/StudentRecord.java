
public class StudentRecord {
	public static void main(String args[]) {
		
		byte age = 21;
		short attendance = 85;
		int rollNo = 51;
		long mobileNo = 9843574657l;
		float height = 5.5f;
		double percentage = 88.85;
		char gender = 'F';
		boolean isPresent = true;
		String studentName = "sneha";
		String branch = "CSE";
		int semester = 8;
		double fees = 75000.00;
		
		System.out.println("Student name is --> " + studentName);
        System.out.println("Age is --> " + age);
        System.out.println("Roll number is --> " + rollNo);
        System.out.println("Mobile number is --> " + mobileNo);
        System.out.println("Height is --> " + height);
        System.out.println("Percentage is --> " + percentage);
        System.out.println("Gender is --> " + gender);
        System.out.println("Is present --> " + isPresent);
        System.out.println("Branch is --> " + branch);
        System.out.println("Semester is --> " + semester);
        System.out.println("Attendance is --> " + attendance);
        System.out.println("Fees is --> " + fees);
        
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
