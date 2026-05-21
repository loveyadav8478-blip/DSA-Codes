package LinkedList;
public class BasicsLL {

    public static int length(Node head){
        if (head == null) return -1;
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void displayr(Node head){
        if (head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void displayReverse(Node head){
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

    public static class Node{
        int data; //value
        Node next; //Address of next Node
        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(5);//head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);//tail node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        displayReverse(a);
        System.out.println(a);
//        System.out.println(a.next);//@8efb846
//        System.out.println(b.next);//@2a84aee7
//        System.out.println(c.next);//@a09ee92
//        System.out.println(d.next);//@30f39991
//        System.out.println(e.next);//null

        //Sasta method to display the linked_list
//        Node temp = a;
//        for (int i = 0; i < 5; i++) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

        //Authentic way to display the LinkedList
//        Node temp = a;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
    }
}
