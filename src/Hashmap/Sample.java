package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,42,24,1,2,1,4,3};
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
    }
}
