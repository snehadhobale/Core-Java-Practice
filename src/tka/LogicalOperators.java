package tka;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);

		System.out.println(!true);
		System.out.println(!false);

		System.out.println();
		System.out.println();

		int p = 10;
		int q = 20;
		int r = 30;
		int s = 40;

		System.out.println(p < q && q < r && r < s); // true
		System.out.println(p > q || q > r || r < s); // true
		System.out.println(p == 10 && q == 20 || r == 40); // true
		System.out.println(p == 20 || q == 20 && r == 30); // true
		System.out.println((p == 20 || q == 20) && r == 30); // true
		System.out.println(p < q && q > r || r < s); // true
		System.out.println(p > q && q > r || r > s); // false
		System.out.println(!(p > q) && !(r > s)); // true
		System.out.println(!(p < q && r < s)); // false
		System.out.println(!(p > q || r > s)); // true
		System.out.println((p < q && q < r) || (r > s && s > p)); // true
		System.out.println((p > q || q > r) && (r < s || s < p)); // false
		System.out.println((p + q > r) && (r + q > s)); // true
		System.out.println((p + q == r || r - q == p) && s > r); // true
		System.out.println((p * 2 == q) && (q + r == s)); // false
		System.out.println((p * 2 == q) || (q + r == s)); // true
		System.out.println(!(p == q) && (r != s) || p == 10); // true
		System.out.println(((p < q && r > q) || s == 40) && p == 10); // true
		System.out.println(!((p > q || q > r) && r < s)); // true
		System.out.println((p < q || q < r) && !(r > s || s < p)); // true
		
		System.out.println();
		System.out.println();
		
		int a = 12;
        int b = 18;
        int c = 24;
        int d = 30;

        System.out.println(a < b && c < d);                       // true
        System.out.println(a > b || c < d);                       // true
        System.out.println(a + b > c && c + b > d);              // true
        System.out.println(a + b < c || c + b > d);              // true
        System.out.println(a * 2 == b + 6 && d > c);             // true
        System.out.println(a * 2 != b + 6 || d < c);             // false
        System.out.println((a < b && b < c) || c > d);           // true
        System.out.println((a > b && b > c) || d > c);           // true
        System.out.println((a < b || b > c) && c < d);           // true
        System.out.println((a > b || b > c) && c < d);           // false
        System.out.println(!(a > b) && !(c > d));               // true
        System.out.println(!(a < b) || !(c < d));               // false
        System.out.println((a < b && c > b) || (d == 30));      // true
        System.out.println((a > b || c < b) && (d > a));        // false
        System.out.println(!(a > b && c > d) || b < c);         // true
        System.out.println((a + b == 30 && c + d == 54) || a == 12);        // true
        System.out.println((a * 2 < c || b * 2 > d) && d > c);             // true
        
        System.out.println();
        System.out.println();
        
        System.out.println(10 > 5 && 20 > 15);              // true
        System.out.println(10 > 15 && 20 > 15);             // false
        System.out.println(10 < 15 || 20 < 10);             // true
        System.out.println(10 > 15 || 20 < 10);             // false

        System.out.println(15 == 15 && 20 == 20);           // true
        System.out.println(15 != 20 || 30 == 40);           // true

        System.out.println(!(10 > 20));                     // true
        System.out.println(!(20 > 10));                     // false

        System.out.println(15 > 10 && 20 < 30);             // true
        System.out.println(15 > 20 && 20 < 30);             // false

        System.out.println(15 > 20 || 20 < 30);             // true
        System.out.println(15 == 10 || 20 == 20);            // true

        System.out.println(10 + 5 > 12 && 20 - 5 == 15);    // true
        System.out.println(10 + 5 < 12 || 20 - 5 == 15);    // true

        System.out.println((10 > 5 && 20 > 15) || 30 < 10); // true
        System.out.println((10 > 20 || 20 > 30) && 40 > 10); // false

        System.out.println(!(10 < 20 && 30 > 20));          // false
        System.out.println(!(10 > 20 || 30 < 20));          // true
        
        System.out.println();
        System.out.println();
        
        System.out.println(45 > 12 || 12 > 11 && 45 == 45);        // true
        System.out.println(45 < 12 || 12 > 11 && 45 == 45);        // true
        System.out.println(45 < 12 && 12 > 11 || 45 == 45);        // true
        System.out.println(10 > 20 || 30 > 20 && 40 == 40);         // true
        System.out.println(10 < 20 && 30 > 20 || 40 != 40);        // true
        System.out.println(10 > 20 && 30 > 20 || 40 != 40);        // false
        System.out.println(!(45 > 12) || 12 > 11);                 // true
        System.out.println(!(45 < 12) && 12 > 11);                 // true
        System.out.println(!(45 > 12 && 12 > 11));                 // false
        System.out.println((45 > 12 || 12 < 11) && 45 == 45);          // true
        System.out.println((45 < 12 && 12 < 11) || 45 == 45);       // true
        System.out.println(!(45 < 12 || 12 < 11) && 45 == 45);       // true
        System.out.println((10 + 5 > 12 && 20 - 5 == 15) || 30 < 20);        // true
        System.out.println((10 + 5 < 12 || 20 - 5 != 15) && 30 > 20);        // false
        System.out.println(!((10 + 5 < 12) || (20 - 5 != 15)));       // true
        System.out.println((50 / 5 == 10 && 20 * 2 == 40) || 30 < 10);     // true
        System.out.println(!(50 / 5 != 10) && (20 * 2 == 40));   //true


	}
}