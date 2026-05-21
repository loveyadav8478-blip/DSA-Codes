package Queues;
import java.util.*;
public class BasicsOfQ {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> helper = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        while(q.size()>0){
            int val = q.remove();
            System.out.print(val+" ");
            helper.add(val);
        }
        System.out.println();
        System.out.println(helper);
    }
}
