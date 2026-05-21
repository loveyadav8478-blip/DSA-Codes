package Strings_And_Stringsbuilder;
import java.util.*;
public class SSPalindrome {
    public static void main(String[] args) {
        String str = "abvxcdcba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
