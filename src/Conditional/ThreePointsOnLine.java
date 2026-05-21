package Conditional;

import java.util.Scanner;

public class ThreePointsOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the X1 and Y1 of the line : ");
//        double x1 = sc.nextInt();
//        double y1 = sc.nextInt();
//        System.out.print("Enter the X2 and Y2 of the line : ");
//        double x2 = sc.nextInt();
//        double y2 = sc.nextInt();
//        System.out.print("Enter the X3 and Y3 of the line : ");
//        double x3 = sc.nextInt();
//        double y3 = sc.nextInt();
//        double m1 = (y2-y1)/(x2-x1);
//        double m2 = (y3-y1)/(x3-x1);
//        if (m1 == m2){
//            System.out.println("Points are lies on the Straight Line..");
//        }else{
//            System.out.println("Points are not lies on the Straight Line..");
//        }
        System.out.print("Enter the co-ordinates X and Y  : ");
        double x = sc.nextInt();
        double y = sc.nextInt();
        if(x == 0 && y == 0) {
            System.out.println("The Point lies on the Origin(0,0)..");
        }else if (x == 0){
            System.out.println("The Point lies on the Y axis..");
        }else if (x != 0 && y != 0){
            System.out.println("The Point lies in the X-Y Plane..");
        }else{
            System.out.println("The Point lies on the X axis..");
        }
    }
}
