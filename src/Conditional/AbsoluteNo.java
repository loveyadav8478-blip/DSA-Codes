package Conditional;

import java.util.Scanner;

public class AbsoluteNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
         if (n<0){
             n = (-1)*n;
         }
        System.out.print("The absolute number is : "+n);
    }
}
