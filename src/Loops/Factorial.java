package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println("The Factorial of given number is : 1");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
                System.out.println(""+i+"! is: "+fact);
            }
            System.out.println("Factorial is : " + fact);
        }
    }
}
