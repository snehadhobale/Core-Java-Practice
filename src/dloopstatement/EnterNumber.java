package dloopstatement;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a number from 1 to 10: ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        System.out.println("Valid number: " + n);
        sc.close();
    }
}