package slidingWindow;
import java.util.*;
public class Leetcode395 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("bbaaacbd",3));
    }
    public static int longestSubstringx(String s, int k) {
        int n = s.length();
        int max = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i<n ;i++){
            Map<Character,Integer> m = new HashMap<>();
            for(j = i; j< n; j++){
                boolean bool = true;
                char ch = s.charAt(j);
                m.put(ch,m.getOrDefault(ch,0)+1);
                for(var v : m.values()){
                    if(v<k){
                        bool = false;
                        break;
                    }
                }
                if(bool) max = Math.max(max,j-i+1);
            }
        }
        return max;
    }

    public static int longestSubstring(String s, int k) {
        int n = s.length();
        int max = 0;
        int i = 0;
        int j = 0;
        Map<Character,Integer> m = new HashMap<>();
        while(j<n){
            boolean bool = true;
            char ch = s.charAt(j);
            m.put(ch,m.getOrDefault(ch,0)+1);

            for(var v : m.values()){
                if(v<k){
                    bool = false;
                    break;
                }
            }
            if(j==n-1){
                while(!bool && i<n){
                    m.put(s.charAt(i),m.get(s.charAt(i))-1);
                    if(m.get(s.charAt(i))==0){
                        m.remove(s.charAt(i));
                    }
                    i++;
                }
                for(var v : m.values()){
                    if(v<k){
                        bool = false;
                        break;
                    }
                }
            }
            if(bool) max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
