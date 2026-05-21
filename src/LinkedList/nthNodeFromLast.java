package LinkedList;

public class nthNodeFromLast {
    public static Node nthNode(Node head, int val){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - val + 1;
        temp = head;
        for (int i = 0; i < m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static int size2(Node head2){
        Node temp = head2;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
    public static Node deleteNthFromLast(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i = 0; i<n;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node deleteFromMiddleR(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node deleteFromMiddleL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int size1(Node head1){
        Node temp = head1;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static Node ans(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int lenA = 0, lenB = 0;
        while(temp1 != null){
            lenA++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            lenB++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (lenA > lenB) {
            int stp1 = lenA-lenB;
            for (int i = 0; i < stp1; i++) {
                temp1 = temp1.next;
            }
        }else{
            int stp2 = lenB-lenA;
            for (int i = 0; i < stp2; i++) {
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static  Node deleteMiddle(Node head) {
        Node temp = head;
        int leng = 0;
        while (temp != null) {
            leng++;
            temp = temp.next;
        }
        temp = head;
        int middle;
        if (leng % 2 == 0)
            middle = (leng / 2) + 1;
        else middle = leng / 2;
        for (int i = 0; i < middle - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(1);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node a1 = new Node(5);
        Node b1 = new Node(6);
        Node c1 = new Node(1);
        Node d1 = new Node(8);
        Node e1 = new Node(4);
        Node f1 = new Node(5);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
//        System.out.println(deleteFromMiddle(a1));
        display(a1);
//        System.out.println(a);
//        display(a1);
//        System.out.println(size1(a1));
//        display(a);
//        System.out.println(size2(a));
//        Node temp = nthNode2(a,2);
//        System.out.println(temp.data);
//        a = deleteNthFromLast(a,2);
        display(a);
    }
}
