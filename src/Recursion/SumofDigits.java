package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(SOD(0));
    }
    static int SOD(int n){
        if (n >= 0 && n <= 9) return n;
        return SOD(n/10) + n%10;
    }
}
