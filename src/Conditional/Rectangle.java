package Conditional;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        double len = sc.nextInt();
        System.out.print("Enter the bredth of the rectangle : ");
        double bre = sc.nextInt();
        double area = len * bre;
        double perimeter = 2 * (len + bre);
        /*System.out.println("The area of the rectangle is : "+area);
        System.out.println("The perimeter of the rectangle is : "+perimeter);*/
        if(area > perimeter){
            System.out.println("Area is greater then the perimeter..");
        } else if(perimeter > area){
            System.out.println("Perimeter is greater then area..");
        }else {
            System.out.println("Perimeter and area are equal..");
        }
    }
}
