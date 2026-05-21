package Recursion.RecursionWithString;

public class compareNM {
    public static void main(String[] args) {
        System.out.println(compareNM(8,4));
    }
    public static String compareNM(int n, int m) {
        if(n==m) return "equal";
        if(n>m) return "greater";
        return "lesser";
    }
}
