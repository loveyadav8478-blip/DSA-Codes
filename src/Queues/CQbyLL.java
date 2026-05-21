package Queues;
public class CQbyLL {
    public static class LLCQ{
        public static class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
            }
        }
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node nNode = new Node(x);
            if (tail == null) {
                head = tail = nNode;
                return;
            }
            tail.next = nNode;
            tail = nNode;
            tail.next = head;
            size++;
        }
        public int remove(){
            Node t = head;
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            head = head.next;
            tail.next = head;
            size--;
            return t.val;
        }
        public int peek(){
            if (head == null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }
        public boolean isEmpty(){
            if (size == 0) {
                return true;
            }
            return false;
        }
        public void display(){
            Node t = head;
            while(t!=null){
                System.out.print(t.val+" ");
                t = t.next;
            }
            tail.next = head;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLCQ q = new LLCQ();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.display();
    }
}
