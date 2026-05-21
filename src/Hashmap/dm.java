package Hashmap;
import java.util.*;
public class dm {
    public static void main(String[] args) {
        String s = "successes";
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!m.containsKey(ch)){
                m.put(ch,1);
            }
            else{
                m.put(ch,m.get(ch)+1);
            }
        }
        int vowel = 0;
        int conso = 0;
        for(var val : m.entrySet()){
            if(m.get(val)=='a' || m.get(val)=='e' ||m.get(val)=='i' || m.get(val)=='o'||m.get(val)=='u'){
                vowel++;
            }
            else{
                conso++;
            }
        }
        System.out.println(vowel);
        System.out.println(conso);
    }
}
