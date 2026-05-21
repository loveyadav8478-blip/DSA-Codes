package Recursion.RecursionWithString;
import java.util.Scanner;
public class Reverse {
//    public static void main(String[] args) {
//        String str = "MalayalaM";
//        String reversed = "";
//        for (int i = str.length()-1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        System.out.println(reversed);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(revewrseString2(str));
        System.out.println(palindrome(str));
    }
    static String revewrseString(String str, int i){
        //base case
        if (i == str.length()) return "";
        //recursive work
        String smallAns = revewrseString(str,i+1);
        //self work
        return smallAns + str.charAt(i);
    }
    static String revewrseString2(String str){
        //base case
        if (str.length() == 0) return "";
        //recursive work
        String smallAns = revewrseString2(str.substring(1));
        //self work
        return smallAns + str.charAt(0);
    }
    static boolean palindrome(String str){
        //base case
        if (str.length() == 0) return true;
        //recursive work
        String smallAns = revewrseString2(str.substring(1));
        //self work
        String ans = smallAns + str.charAt(0);
        if (ans.equals(str)) return true;
        else return false;
    }
}
