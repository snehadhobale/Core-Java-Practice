 
public class Employee {
	public static void main(String args[]){
		
		byte exp = 3;
		short age = 33;
		int empId = 2134;
		long adharNo = 45768976897678l;
		
		float height = 5.7f;
		double salary = 80000.00;
		
		char gender = 'F';
		boolean is_Status = true;
		
		System.out.println("Employee exp is -->" + exp );
		System.out.println("Employee age is -->" + age);
		System.out.println("empId is -->" + empId);
		System.out.println("adharNo is -->" + adharNo);
		System.out.println("height is -->" + height);
		System.out.println("salary is -->" + salary);
		System.out.println("gender is -->" + gender);
		System.out.println("is_Status is -->" + is_Status);
		
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
