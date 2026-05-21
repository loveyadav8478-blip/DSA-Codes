package Loops;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        int total = 0;
//        while (n != 0) {
//            int last = n % 10;//Extract last digit
//            total += last;//sum = sum+last
//            n /= 10;
//        }
//        System.out.println("The  digit of number is : " + total);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int total = 0;
        while (n != 0) {
            int last = n % 10;//Extract last digit
            if(n%2 == 0)
            total += last;//sum = sum+last
            n /= 10;
        }
        System.out.println("The  digit of number is : " + total);
    }
}
