package Graph;

import java.util.*;

public class AlienDict {
    public static void main(String[] args) {
        System.out.println(findOrder(new String[]{"dddc", "a" ,"ad", "ab", "b", "be", "cd" ,"cded"}));
    }
    public static String findOrder(String[] words) {
        int n = words.length;
        Queue<Character> q = new LinkedList<>();
        Map<Character,List<Character>> adj = new HashMap<>();
        Map<Character,Integer> inDeg = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(String str : words){
            for(char ch : str.toCharArray()){
                adj.put(ch,new ArrayList<>());
                inDeg.put(ch,0);
            }
        }


        for(int i = 0; i< n-1; i++){
            String s1 = words[i];
            String s2 = words[i+1];
            if(s1.length()>s2.length() && s1.startsWith(s2)){
                return "";
            }
            int k = 0, l = 0;
            while(k<s1.length() && l<s2.length()){
                if(s1.charAt(k)!=s2.charAt(l)){
                    char u = s1.charAt(k);
                    char v = s2.charAt(l);
                    if(!adj.get(u).contains(v)){
                        adj.get(u).add(v);
                        inDeg.put(v,inDeg.get(v)+1);
                    }
                    break;
                }
                k++;
                l++;
            }
        }

        for(var key : inDeg.keySet()){
            if(inDeg.get(key)==0){
                q.add(key);
            }
        }

        while(!q.isEmpty()){
            char e = q.poll();
            ans.append(e);
            for(var c : adj.get(e)){
                inDeg.put(c,inDeg.get(c)-1);
                if(inDeg.get(c)==0){
                    q.add(c);
                }
            }
        }
        if(ans.length()!=adj.size()) return "";
        return ans.toString();
    }

}
