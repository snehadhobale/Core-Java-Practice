package practicequestions;

public class FindTriangle {
	public static void main(String[] args) {
		int side = 5;
		
		if(side == 4) {
			System.out.println("Equilateral");
		}else if(side == 3){
			System.out.println("Isosceles or Scalene");	
		}else {
			System.out.println("Not a triangle");
		}
	}

}
