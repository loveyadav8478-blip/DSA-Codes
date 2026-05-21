package Heap;
import java .util.*;
public class find_Kth_ClosestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) -> {
                    if(!a.getKey().equals(b.getKey())) return a.getKey()-b.getKey();
                    return a.getValue()-b.getValue();
                }      
        );
        for (int i: arr) {
            int dist = Math.abs(x-i);
            pq.add(new AbstractMap.SimpleEntry<>(dist,i));
        }
        List<Integer> ans = new ArrayList<>();
        while(pq.size()<k){
            Map.Entry<Integer,Integer> temp = pq.remove();
            ans.add(temp.getValue());
            k--;
        }
        Collections.sort(ans);
//        return ans;
    }
}
