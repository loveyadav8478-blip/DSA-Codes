package Loops;
import java.util.Scanner;
public class LargestFactorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int hf = 1;
        for (int i = n-1; i >= 1 ; i--) {
                if(n%i == 0){
                    hf = i;
                    break;
                }
        }
        System.out.println(hf);
    }
}
