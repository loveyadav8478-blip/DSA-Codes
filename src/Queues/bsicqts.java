package Queues;
import java.util.*;
public class bsicqts {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1);
        while(q1.size()>0){
            System.out.print(q1.peek()+" ");
            q2.add(q1.poll());
        }
        System.out.println();
        while(q2.size()>0){
            System.out.print(q2.peek()+" ");
            q1.add(q2.poll());
        }
        Stack<Integer> st = new Stack<>();
        while(q2.size()>0){
            st.push(q2.poll());
        }
        while(st.size()>0){
            System.out.print(st.pop()+" ");
//            st.pop();
        }
    }
}
