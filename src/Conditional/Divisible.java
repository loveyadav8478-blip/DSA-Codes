package Conditional;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram : ");
        int Ram_age  = sc.nextInt();
        System.out.print("Enter the age of Shyam : ");
        int Shyam_age = sc.nextInt();
        System.out.print("Enter the age of Ajay : ");
        int Ajay_age = sc.nextInt();
//        if(Ram_age < Shyam_age && Ram_age < Ajay_age){
//            System.out.println("Ram is younger.");
//        } else if (Shyam_age < Ram_age && Shyam_age < Ajay_age) {
//            System.out.println("Shayam is younger.");
//        }else {
//            System.out.println("Ajay is younger.");
//        }
        if(Ram_age < Shyam_age){
            if(Ram_age < Ajay_age) {
                System.out.println("Ram is younger.");
            }else{
                System.out.println("Ajay is younger.");
            }
        } else{
            System.out.println("Shayam is younger.");
        }
    }
}
