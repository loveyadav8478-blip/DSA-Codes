package Basics_Of_Java;

import java.util.Scanner;

public class AreaOfSphere {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
        double r = 10;
        double pi = 3.14;
        double volume = (4 * pi * r * r * r) / 3;
        System.out.println(volume);
    }
}
