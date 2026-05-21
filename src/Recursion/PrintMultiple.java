package Recursion;

public class PrintMultiple {
    public static void main(String[] args) {
        printMultiple(12,6);
    }
    static void printMultiple(int n, int k){
        if (k == 0) {
            return;
        }
        printMultiple(n,k-1);
        System.out.print(n*k+" ");
    }
}
