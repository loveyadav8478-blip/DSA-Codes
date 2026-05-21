package Recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(Gcd(7,21));
        System.out.println(GCD(24,15));
    }
    static int Gcd(int x, int y){
        while(x%y != 0){
            int rem = x % y;
            x = y;
            y = rem;

        }
        return y;
    }
    static int GCD(int x, int y){
        if (y == 0) {
            return x;
        }
        return GCD(y,x%y);
    }
}
