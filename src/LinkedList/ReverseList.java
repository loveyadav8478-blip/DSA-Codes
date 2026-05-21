package LinkedList;

public class ReverseList {
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
//    public static void reverse(Node head){
//        if(head == null) return;
//        while(head!=null){
//
//        }
//    }
    public static Node reverseL(Node head){
        if (head.next == null) return head;
        Node newHead = reverseL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
        System.out.println();
        a = reverseL(a);
        display(a);
    }
}
