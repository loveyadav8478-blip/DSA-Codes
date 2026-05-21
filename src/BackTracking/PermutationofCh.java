package BackTracking;

import  java.util.*;
public class PermutationofCh {
    public static void printp(String s, String t, List<String> l){
        if (s.length()==0) {
            l.add(t);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left+right;
            printp(rem,t+ch,l);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "";
        List<String> l = new ArrayList<>();
        printp(s,t,l);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
    }
}
