public class nn{
    public static void main(String[] args) {
        System.out.println(removeCoveredIntervals(new int[][]{{1,4},{2,3}}));
    }
    public static int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        int n = intervals.length;
        for(int i = 0; i<n; i++){
            boolean covered = false;
            for(int j = 0; j<n; j++){
                if(i==j) continue;
                int prevIst = intervals[i][0];
                int prev2nd = intervals[i][1];
                int nextIst = intervals[j][0];
                int next2nd = intervals[j][1];
                if(nextIst<=prevIst && prev2nd<=next2nd){
                    covered = true;
                    break;
                }
            }
            if(!covered) count++;
        }
        return count;
    }
}