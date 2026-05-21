package Hashmap;
import java.util.*;
public class FirstUniqueCHar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        firstUniqChar(s);

    }
    public static void firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!m.containsKey(ch)) {
                m.put(ch,1);
            }
            else{
                m.put(ch,m.get(ch)+1);
            }
        }
        for(var a : m.entrySet()){

        }
        System.out.println(m);
    }
}
