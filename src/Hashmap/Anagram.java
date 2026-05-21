package Hashmap;
import java.util.*;
public class Anagram {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!m.containsKey(ch)){
                m.put(ch,1);
            }
            else{
                m.put(ch,m.get(ch)+1);
            }
        }
        return m;
    }
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character,Integer> m = makeFreqMap(s);
        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)-1);
            }
        }
        for(var a : m.values()){
            if(a!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
