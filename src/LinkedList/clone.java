package LinkedList;

import java.util.*;

public class clone {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        if (head == null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static Node clone(Node head){
        if (head == null) return null;
        Node dummy = new Node(0);
        Node a = dummy;
        Node curr = head;
        while (curr != null) {
            a.next = new Node(curr.val);
            a = a.next;
            curr = curr.next;
        }
        return dummy.next;
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        LinkedList<Integer> l = new LinkedList<>();
        Node temp = a;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        System.out.println(l);
//        display(a);
    }

}
