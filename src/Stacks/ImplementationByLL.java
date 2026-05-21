package Stacks;

public class ImplementationByLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int pop(){
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            Node a = head;
            Node temp = head.next;
            head = temp;
            return a.val;
        }
        int peek(){
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        st.push(50);
        st.display();
        st.push(60);
//        System.out.println(st.isEmpty());
        st.display();
    }
}
