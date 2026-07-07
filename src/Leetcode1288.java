import java.util.Arrays;
import java.util.Comparator;

public class Leetcode1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->(a[0]==b[0]) ? Integer.compare(b[1],a[1]) : Integer.compare(a[0],b[0]));
        int coveredCount = 0;
        int n = intervals.length;
        int min = intervals[0][0];
        int max = intervals[0][1];
        for(int i = 1; i<n; i++){
            if(min<=intervals[i][0] && max>=intervals[i][1]){
                coveredCount++;
            }
            else{
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        return n-coveredCount;
    }
}
