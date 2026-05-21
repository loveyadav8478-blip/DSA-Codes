package Strings_And_Stringsbuilder;
import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
//        String str = "aaaabbbbc";
//        String ans = " "+str.charAt(0);
//        int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            char curr = str.charAt(i);
//            char prev = str.charAt(i-1);
//            if (prev == curr) {
//                count++;
//            }else{
//                if(count > 1)ans += count;
//                count = 1;
//                ans += curr;
//            }
//        }
//        if(count > 1)ans += count;
//        System.out.println(ans);
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
    static int compress(char[] chars) {
        String ans = " "+chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            char curr = chars[i];
            char prev = chars[i-1];
            if (prev == curr) {
                count++;
            }else{
                if(count > 1)ans += count;
                count = 1;
                ans += curr;
            }
        }
        if(count > 1)ans += count;
        return count;
    }
}
