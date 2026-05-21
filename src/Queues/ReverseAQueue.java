package Queues;
import java.util.*;
public class ReverseAQueue {
    static void reverseForKth(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for (int i = 0; i < n; i++) {
            st.push(q.poll());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        for (int i = 0; i < n-k; i++) {
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        reverseForKth(q,3);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
