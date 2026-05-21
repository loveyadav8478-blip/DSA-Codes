package Patterns;
import java.util.Scanner;
public class NosSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and cols : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
