package slidingWindow;
import java.util.*;
public class RepeatedDNA {
//    Brute Force
    public List<String> findRepeatedDnaSequencesBF(String s) {
        int n = s.length();
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j< Math.min(n,i+10); j++){
                char ch = s.charAt(j);
                sb.append(ch);
            }
            if(!m.containsKey(sb.toString())){
                m.put(sb.toString(),1);
            }
            else{
                m.put(sb.toString(),m.get(sb.toString())+1);
            }
        }
        List<String> ans = new ArrayList<>();
        for(var key : m.keySet()){
            if(m.get(key)>1){
                ans.add(key);
            }
        }
        return ans;
    }

//    Sliding Window
public List<String> findRepeatedDnaSequences(String s) {
    int n = s.length();
    Map<String,Integer> m = new HashMap<>();
    List<String> ans = new ArrayList<>();
    int i = 0;
    int j = 0;
    StringBuilder sb = new StringBuilder();
    for(j = 0; j< Math.min(n,10); j++){
        sb.append(s.charAt(j));
    }
    m.put(sb.toString(),1);
    while(j<n){
        i++;
        sb = new StringBuilder(s.substring(i, j + 1));
        if(!m.containsKey(sb.toString())){
            m.put(sb.toString(),1);
        }
        else{
            m.put(sb.toString(),m.get(sb.toString())+1);
        }
        j++;
    }
    for(var key : m.keySet()){
        if(m.get(key)>1){
            ans.add(key);
        }
    }
    return ans;
}
}
