package Greedy;

import org.jetbrains.annotations.NotNull;

import java.util.*;
public class FractionalKnapsack{
    class Triplet implements Comparable<Triplet>{
        double ratio;
        int val;
        int wt;
        Triplet(double ratio, int val, int wt){
            this.val = val;
            this.ratio = ratio;
            this.wt = wt;
        }

        @Override
        public int compareTo(Triplet o) {
            return Double.compare(this.ratio,o.ratio);
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        List<Triplet> temp = new ArrayList<>();
        for(int i = 0; i< n; i++){
            temp.add(new Triplet((double)val[i]/wt[i],val[i],wt[i]));
        }
        Collections.sort(temp);
        int t = capacity;
        double ans = 0;
        for(int i = temp.size()-1; i>=0; i--){
            Triplet e = temp.get(i);
            double ratio = e.ratio;
            int value = e.val;
            int wtLimit = e.wt;
            if(wtLimit<t){
                ans += value;
                t -= wtLimit;
            }
            else{
                ans += t*ratio;
                break;
            }
        }
        return ans;
    }
}
