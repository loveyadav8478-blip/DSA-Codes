package slidingWindow;
import java.util.*;
public class Leetcode1358 {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    public static int numberOfSubstrings(String s) {
        int n  = s.length();
        Map<Character,Integer> m = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<n){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            while(m.size()==3){
                ans += 1+(n-j);
                m.put(s.charAt(i),m.get(s.charAt(i))-1);
                if(m.get(s.charAt(i))==0) m.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return ans;
    }
}
