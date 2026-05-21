package Loops;

import java.util.Scanner;
public class PrintOnetoTen {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a : ");
//        int a = sc.nextInt();
//        System.out.print("Enter b : ");
//        int b = sc.nextInt();
//        for(int i = a; i<=b ; i++){
//            System.out.println(i);
        for(int i = 1; i <= 100; i++){
        if(i % 3 == 0){
            System.out.println(i);
            }
        }
    }
}
