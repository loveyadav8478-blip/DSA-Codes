package slidingWindow;
import java.util.*;
public class Celeb {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{0,0,0,1,0,1,1,1,1,0,1}, new int[]{0,0,0,1,0,0,0,0,0,1,0}));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<n; i++) q.add(students[i]);
        int count = 0;
        int j = 0;
        int limit = 100;
        int c = 0;
        while(!q.isEmpty()){
            boolean bool = false;
            if(q.peek()==sandwiches[j]){
                bool = true;
                q.poll();
                count++;
                j++;
            }
            if(!q.isEmpty() && q.peek()!=sandwiches[j] && !bool){
                int e = q.poll();
                q.add(e);
            }


            c++;
            if(c>100) break;

        }
        return count==n ? 0 : count;
    }
}
