
public class Mobile {
	public static void main(String[] args) {
		
		byte ram = 8;
        short storage = 256;
        int modelNumber = 2026;
        long imeiNumber = 123456789012345L;
        float screenSize = 6.7f;
        double price = 54999.99;
        char network = '5';
        boolean is5G = true;
        String brand = "Samsung";
        
        System.out.println("RAM is -->" + ram + "GB");
        System.out.println("storage is -->" +storage + "GB");
        System.out.println("Model number is --> " + modelNumber);
        System.out.println("IMEI number is --> " + imeiNumber);
        System.out.println("Screen size is --> " + screenSize);
        System.out.println("Price is --> " + price);
        System.out.println("Network is --> " + network + "G");
        System.out.println("Is 5G --> " + is5G);
        System.out.println("Brand is --> " + brand);
        
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
