package Basics_Of_Java;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int a = sc.nextInt();
        System.out.print("Enter the divisor : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("The remainder is : "+r);
    }
}
