package Loops;
import java.util.Scanner;
public class PrintAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("AP is : ");
//        for(int i = 1; i <= (2*n-1) ;i+=2){
//            System.out.print(" "+i);
//        }

        //        System.out.println();


//        System.out.print("Enter the value of n1 : ");
//        int n1 = sc.nextInt();
//        System.out.print("AP is : ");
//        for(int i = 4; i <= (3* n1 +1) ; i+=3){
//            System.out.print(" "+i);
//        }


        /*          OR     -->>THIS IS A GENERAL FORM TO PRINT ANY AP     */
//        int a = 1, d = 2;
//        for(int i = 1; i <= n; i++){
//            System.out.print(a+" ");
//            a += d;
//        }


        /*THIS IS A GENERAL FORM TO PRINT ANY GP*/

//        int a = 1, r = 2;
//        for(int i = 1; i <= n; i++){
//            System.out.print(a+" ");
//            a *= r;
//        }

        // 3 12 48 192
        int a = 3, r = 4;
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
