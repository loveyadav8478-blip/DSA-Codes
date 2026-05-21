package Loops;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;//false means prime
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(n==1){
            System.out.println("Neather Prime nor Composite.");
        }else if (flag == false){
            System.out.println("The number is Prime.");
        }else{
            System.out.println("Composite Number.");
        }
    }
}
