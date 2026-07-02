package Greedy;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class NMeetings {
    public static void main(String[] args) {
//        System.out.println(maxMeetings(new int[]{23,33,45,48,30}, new int[]{46,81,59,85,53}));
//        System.out.println(reverseWords("i.like.this.program.very.much"));
        StringBuilder sb = new StringBuilder("99990");
        sb.replace(4,4,"9");
        System.out.println(sb);
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int st = 0;
        int ed = s.length()-1;


        Set<Character> c = new HashSet<>();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i< abc.length(); i++) c.add(abc.charAt(i));

        while((!c.contains(s.charAt(st)) && !c.contains(s.charAt(st)))){
            st++;
        }
        while((!c.contains(s.charAt(ed)) && !c.contains(s.charAt(ed)))){
            ed--;
        }
        int n = s.length();


            StringBuilder t = new StringBuilder();
        for(int i = ed; i>=st; i--){
            char ch = s.charAt(i);
            if(ch=='.' && t.length()!=0){
                sb.append(t.reverse());
                if(i>st){
                    sb.append(".");
                }
                t = new StringBuilder();
            }
            else{
                if(ch!='.') t.append(ch);
            }
        }
        return sb.toString();
    }
//    static class Pair  implements Comparable<Pair>{
//        int st;
//        int ed;
//        Pair(int st, int ed){
//            this.st = st;
//            this.ed = ed;
//        }
//
//        @Override
//        public int compareTo(@NotNull Pair o) {
//            return this.ed-o.ed;
//        }
//    }
    static class Pair  implements Comparable<Pair>{
        int st;
        int ed;
        int i;
        Pair(int st, int ed, int i){
            this.st = st;
            this.ed = ed;
            this.i = i;
        }

        @Override
        public int compareTo(@NotNull Pair o) {
            return this.ed-o.ed;
        }
    }
//    public static int activitySelection(int[] start, int[] finish) {
//        int n = start.length;
//        List<Pair> l = new ArrayList<>();
//        for(int i = 0; i<n; i++){
//            l.add(new Pair(start[i], finish[i]),i);
//        }
//        Collections.sort(l);
//        int ans = 1;
//        Pair p = l.get(0);
//        int ending = p.ed;
//        int starting = p.st;
//        int prevEnd = p.ed;
//        for(int i = 0; i< l.size(); i++){
//            Pair p1 = l.get(i);
//            if(p1.st>prevEnd && starting<ending){
//                ans++;
//                starting = p1.st;
//                ending = p1.ed;
//                prevEnd = ending;
//            }
//        }
//        return ans;
//    }
    public static List<Integer> maxMeetings(int[] start, int[] finish) {
        List<Integer> ans = new ArrayList<>();
        int n = start.length;
        List<Pair> l = new ArrayList<>();
        for(int i = 0; i<n; i++){
            l.add(new Pair(start[i], finish[i],i));
        }
        Collections.sort(l);
        ans.add(1);
        int prevEnd = l.get(0).ed;
        for(int i = 1; i< l.size(); i++){
            Pair p1 = l.get(i);
            if(p1.st>prevEnd){
                ans.add(p1.i+1);
                prevEnd = l.get(i).ed;
            }
        }
        return ans;
    }
}
