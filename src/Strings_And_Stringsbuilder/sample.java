package Strings_And_Stringsbuilder;
import java.util.*;
public class sample {
    public static void main(String[] args) {
        String s = "lEetcOde";
        ArrayList<Character> vow = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O'|| ch=='u'|| ch=='U'){
                vow.add(ch);
            }
            Collections.sort(vow);
        }
        System.out.println(vow);
    }
}
