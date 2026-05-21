package Dynammic_Programming;

public class NthFibonacci {
    static int[] arr;
    public static void main(String[] args) {
        int n = 10000;
        arr = new int[n+1];
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<=1) return n;
        if(arr[n]!=0) return arr[n];
        int ans = fibo(n-1)+fibo(n-2);
        arr[n] = ans;
        return ans;
    }
}
