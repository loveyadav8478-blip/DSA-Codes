package Loops;
import java.util.Scanner;
public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int Reverse_number = 0;
        int Original = n;
        while(n != 0){
            int last  = n % 10;
            Reverse_number = (Reverse_number * 10) + last;
            n /= 10;
        }
            System.out.println("Reverse number is : "+Reverse_number);

        int sum = Original + Reverse_number;
        System.out.println(sum);
    }
}
