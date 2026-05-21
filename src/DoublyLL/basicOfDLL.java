package DoublyLL;
public class basicOfDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayForCircular(Node head){
        Node temp = head;
        System.out.print(temp.val+" ");
        temp = temp.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int H){
        Node t = new Node(H);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static Node insertAtTail(Node head,int H){
        Node a = new Node(H);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = a;
        a.prev = temp;
        return head;
    }
    public static void insertAtidx(Node head, int idx,int H){
        Node s = head;
        Node t = new Node(H);
        for (int i = 0; i < idx-1; i++) {
            s = s.next;
        }
        Node r = s.next;
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static Node deleteAtTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }
    public static Node deleteAtHead(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        temp = temp.next;
        temp.prev = null;
        return temp;
    }
    public static Node deleteAtIdx(Node head, int idx){
        if (idx == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }
        Node t = head;
        for (int i = 0; i < idx-1; i++) {
            t = t.next;
        }
        t.next = t.next.next;
        t.next.prev = t;
        return head;
    }
    public static boolean checkPalindrome(Node head) {
        if (head == null || head.next!=null) return true;
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        Node left = head;
        Node right = tail;
        while (left != right) {
            if (left.val != right.val) return false;
        }
            left = left.next;
            right = right.prev;

        return true;
    }
    public static int twoSum(Node head, int target){
        Node t = head;
        while (t.next != null) t = t.next;
        Node h = head;
//        Node right = t;
        while(t.val > h.val){
            if (t.val+ h.val == target) {
                return t.val+ h.val;
            } else if (t.val+ h.val > target) {
                t = t.prev;
            }else{
                h = h.next;
            }
        }
        return -1;
    }
    public static void criticalPtsDist(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("[-1, -1]");
            return;
        }
        Node prev = head;
        Node curr = head.next;
        int idx = 1;
        int first = -1, last = -1;
        int minDist = Integer.MAX_VALUE;
        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                    (curr.val < prev.val && curr.val < curr.next.val)) {
                if (first == -1) {
                    first = idx;
                } else {
                    minDist = Math.min(minDist, idx - last);
                }
                last = idx;
            }
            prev = curr;
            curr = curr.next;
            idx++;
        }
        if (first == -1 || first == last) {
            System.out.println("[-1, -1]");
        } else {
            int maxDist = last - first;
            System.out.println("[" + minDist + ", " + maxDist + "]");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = h;
        i.prev = h;
        h.next = null;
//        System.out.println(checkPalindrome(a));
//        System.out.println(twoSum(a,404));
        display(a);
        criticalPtsDist(a);
//        displayForCircular(a);
//        a = deleteAtIdx(a, 0);
//        deleteAtIdx(a,0);
//        display(a);
//        deleteAtTail(a);
//        Node aa = deleteAtHead(a);
//        display(aa);
//        display(a);
//        displayRev(e);
//        display2(e);
//        display(a);
//        Node nHead = insertAtHead(a,30);
//        Node nTail = insertAtTail(a,30);
//        display(nTail);
//        insertAtidx(a,3,56);
//        insertAtidx(a,3,50);
    }
}
