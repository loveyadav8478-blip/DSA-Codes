package Loops;

import java.util.Scanner;

public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int product = 1;
        while (n != 0) {
            int last = n % 10;//Extract last digit
                if(last != 0)
                product *= last;
                n /= 10;

        }
        System.out.println("The Product of digit of number is : " + product);
    }
}
