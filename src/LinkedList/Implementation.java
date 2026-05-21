package LinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        void insertAtTail(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        public void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtTail(val);
            }else{
                temp.next = head;
                head = temp;
            }
        }
        public void insertAt(int idx, int val) {
            Node temp = head;
            Node tar = new Node(val);
            if (idx == size()) {
                insertAtTail(val);
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            for (int j = 0; j < idx-1; j++) {
                temp = temp.next;
            }
            tar.next = temp.next;
            temp.next = tar;
        }

        void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int len = 0;
            while(temp != null){
                len++;
                temp = temp.next;
            }
            return len;
        }

        public int getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {head = head.next;
                return;}
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size()-1) tail = temp;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.insertAtHead(12);
        ll.insertAtTail(4);
        ll.insertAtTail(5);
        ll.insertAtTail(6);
        ll.insertAtTail(7);
        ll.insertAtTail(2);
//        ll.display();
//        System.out.println();
//        System.out.println(deleteMiddle(a));
//        ll.deleteAt(0);
//        ll.display();
//        System.out.println();
//        System.out.println(ll.size());
//        System.out.println(ll.getAt(4));
//        System.out.println();
//        ll.size();
//        ll.insertAt(0,10);
//        System.out.println(ll.getAt(4));
//        ll.display();
//        System.out.println(ll.size());
    }
}
