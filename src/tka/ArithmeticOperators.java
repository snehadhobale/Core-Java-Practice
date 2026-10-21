package tka;

public class ArithmeticOperators {
	public static void main(String args[]) {
		int a = 8;
		int b = 9;
		int c = 5;
		
		System.out.println("Addition of "+a+" + "+b+" = "+ (a+b));
		System.out.println("Subtraction of "+a+" - "+b+" = "+(a-b));
		System.out.println("Multiplication of "+a+" * "+b+" = "+(a*b));
		System.out.println("Division of "+a+" / "+b+" = "+(a/b));
		System.out.println("Modulus of "+a+" % "+b+" = "+(a%b));
		
		System.out.println();
		
		System.out.println("Addition of "+a+" + "+b+" + "+c+" = "+ (a+b+c));
		System.out.println("Subtraction of "+a+" - "+b+" - "+c+" = "+(a-b-c));
		System.out.println("Multiplication of "+a+" * "+b+" * "+c +" = "+(a*b*c));
		System.out.println("Division of "+a+" / "+b+" / "+c+" = "+(a/b/c));
		System.out.println("Modulus of "+a+" % "+b+" % "+c+" = "+(a%b%c));
		
		System.out.println();
		
		System.out.println(a-c*b);
		System.out.println(a==b);
		System.out.println(a!=c);
		System.out.println(a<c);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=c);
		}
}
