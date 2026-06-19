package slidingWindow;

import java.util.*;

public class SlidingWindowMaximum {
    class C implements Comparator<C> {
        int a;
        C(int a){
            this.a = a;
        }

        @Override
        public int compare(C o1, C o2) {
            return Integer.compare(o1.a, o2.a);
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        Deque<C> q = new ArrayDeque<>();
        for(j = 0; j< k; j++){
            q.add(new C(nums[j]));
        }
        l.add(q.peek().a);
        while(j<n){
            int mx = Integer.MIN_VALUE;
            q.removeFirst();
            q.add(new C(nums[j]));
            l.add(q.peek().a);
            i++;
            j++;
        }
        int[] ans = new int[l.size()];
        for(int m = 0; m < l.size(); m++){
            ans[m] = l.get(m);
        }
        return ans;
    }
}

