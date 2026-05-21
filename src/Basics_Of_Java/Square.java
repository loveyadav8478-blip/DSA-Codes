package Basics_Of_Java;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sqre = num*num;
        System.out.println("The square of the number is : "+sqre);
    }
}
