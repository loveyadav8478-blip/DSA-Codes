package Strings_And_Stringsbuilder;
import java.util.*;
public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb.delete(0,str.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
