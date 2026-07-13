package Hashmap;
import java.util.*;
public class Podt {
    public static void main(String[] args) {
        System.out.println(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}));
    }
    public static int[] arrayRankTransform(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i = 0; i< n; i++) temp[i] = nums[i];
        // Arrays.sort(temp);
        Map<Integer,Integer> m = new TreeMap<>();
        int rnk = 1;
        for(int i = 0; i< n; i++){
            m.put(temp[i],0);
        }
        for(int key : m.keySet()){
            m.put(key,rnk++);
        }

        int[] rank = new int[n];
        for(int i = 0; i<n ;i++){
            rank[i] = m.get(nums[i]);
        }
        return rank;
    }
}
