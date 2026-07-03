package Greedy;
import java.util.*;
public class JobSequencingProblem {
    class Job implements Comparable<Job>{
        int jobNo;
        int deadLine;
        int profit;
        Job(int profit, int jobNo, int deadLine){
            this.profit = profit;
            this.jobNo = jobNo;
            this.deadLine = deadLine;
        }
        @Override
        public int compareTo(Job a){
            return a.profit - this.profit;
        }

    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        List<Job> jobs = new ArrayList<>();
        int n = deadline.length;
        int maxDeadline  = -1;
        for(int i = 0; i<n; i++){
            maxDeadline = Math.max(maxDeadline,deadline[i]);
            jobs.add(new Job(profit[i],i,deadline[i]));
        }
        Collections.sort(jobs);
        int[] jobSeq = new int[maxDeadline+1];
        Arrays.fill(jobSeq,-1);
        int ans = 0;
        int jobsDone = 0;
        for(int i = 1; i< jobs.size(); i++){
            int currProfit = jobs.get(i).profit;
            int currDead = jobs.get(i).deadLine;
            int currJob = jobs.get(i).jobNo;
            for(int j = currDead; j>0; j--){
                if(jobSeq[j]==-1){
                    ans += currProfit;
                    jobsDone++;
                    jobSeq[j] = currJob;
                }
            }
        }
        ArrayList<Integer> finalAns = new ArrayList<>();
        finalAns.add(jobsDone);
        finalAns.add(ans);
        return finalAns;
    }
}
