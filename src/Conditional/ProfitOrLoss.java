package Conditional;

import java.util.*;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int CP = sc.nextInt();
        System.out.print("Enter the selling price : ");
        int SP = sc.nextInt();
//        System.out.println("Profit is : "+);
        if (SP > CP){
            System.out.println("Profit is : "+(SP-CP));
        }else{
            System.out.println("Loss is : "+(CP-SP));
        }
    }
}
