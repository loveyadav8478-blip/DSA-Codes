package Strings_And_Stringsbuilder;
import java.util.*;
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i,(char)(ch+32));
            }
        }
        return sb.toString();
    }
}
