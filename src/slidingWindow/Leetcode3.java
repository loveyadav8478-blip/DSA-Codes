package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
//    SLIDING WINDOW
    public int lengthOfLongestSubstring(String s) {
        int max = -1;
        int n = s.length();
        int i = 0;
        int j = 0;
        Set<Character> st = new HashSet<>();
        while(j<n){
            char chj = s.charAt(j);
            while(st.contains(chj)){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(chj);
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }


//    BRUTE FORCE
    public int lengthOfLongestSubstringb(String s) {
        int n = s.length();
        int max = 0;
        int j = 0;
        for(int i =0 ; i<n; i++){
            Set<Character> st = new HashSet<>();
            for(j = i; j< n; j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
                st.add(s.charAt(j));
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
