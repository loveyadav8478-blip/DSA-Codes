package Graph;
import java.util.*;
public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int count = 0;
        int[] visited = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = 1;
        while(q.size()!=0){
            count++;
            int size = q.size();
            for(int i = 0; i< size; i++){
                int e = q.poll();
                for (int j = 0; j <= nums[e]; j++) {
                    int nxt = e+j;
                    if(nxt>=n-1) return count;
                    if(visited[nxt]==0){
                        visited[nxt] = 1;
                        q.add(nxt);
                    }
                }

            }
        }
        return count;
    }
}
