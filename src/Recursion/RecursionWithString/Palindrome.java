package Recursion.RecursionWithString;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "level";
//        System.out.println(isPalindrome1(str,0,str.length()-1));
          int N = 82479;
          int ans = reverseNumber(N,0);
        if (ans == N) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
    static boolean isPalindrome1(String str, int L, int R){
        //base case
        if (L >= R) return true;
        //BP + Recursive Call
        return (str.charAt(L) == str.charAt(R) && isPalindrome1(str,L+1,R-1));
    }
    static int reverseNumber(int N, int revNum){
        //base case
        if (N == 0) return revNum;
        revNum = revNum * 10 + N % 10;
        return reverseNumber(N/10,revNum);
    }
}
