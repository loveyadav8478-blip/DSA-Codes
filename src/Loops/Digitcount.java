package Loops;
import java.util.Scanner;
public class Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) count++;
        while (n != 0) {
                n /= 10;
                count++;
            }
            System.out.println("The digit of number is : " + count);
        }
}
