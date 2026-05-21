package Strings_And_Stringsbuilder;
import java.util.*;
public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "abbd";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                if (isPalindromicSubstring(str.substring(i,j))) {
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }

            }
        }
        System.out.println();
        System.out.println("The number of palindromic sub strings are : "+count);
    }
    static boolean isPalindromicSubstring(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
