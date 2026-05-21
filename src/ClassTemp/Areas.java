package ClassTemp;

import static java.lang.Math.PI;

public class Areas {
    public static void main(String[] args) {
        int r = 10;
        System.out.println("Area of circle "+areaOfCircle(r));
        System.out.println("Perimeter of circle "+perimeterOfCircle(r));
        System.out.println("Area of Rectangle "+areaOfRectangle(10,20));
        System.out.println("Perimeter of Rectangle "+perimnterOfRectangle(10,20));
        System.out.println("Area of Triangle "+areaOfTriangle(10,20));
        System.out.println("Perimeter of Triangle "+perimeterOfTriangle(10,20,30));

    }
    static double areaOfCircle(int r){
        double pi = PI;
        return pi*r*r;
    }
    static double perimeterOfCircle(int r){
        double pi = PI;
        return 2*pi*r;
    }
    static double areaOfRectangle(int l, int b){
        return l*b;
    }
    static double perimnterOfRectangle(int l, int b){
        return 2*(l+b);
    }
    static double areaOfTriangle(int b, int h){
        return (0.5)*b*h;
    }
    static double perimeterOfTriangle(int a, int b, int c){
        return a+b+c;
    }

}
