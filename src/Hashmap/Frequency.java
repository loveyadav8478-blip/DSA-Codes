package Hashmap;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1, 2, 2, 2, 2, 2, 1, 1, 3, 4};
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else{
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
        int maxFreq = Integer.MIN_VALUE;
        int ans = -1;
        for(var a : m.entrySet()){
            if(a.getValue()>maxFreq){
                maxFreq = a.getValue();
                ans = a.getKey();
            }
        }
        System.out.println(ans);
    }
}
