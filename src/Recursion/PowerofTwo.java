package Recursion;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 33;
        if (n == 0) {
//            false;
        }
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
//    static boolean(){

//    }
}
