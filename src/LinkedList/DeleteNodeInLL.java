package LinkedList;

class Node{
    int val;
    Node next;
    Node(int x) { val = x; }
}

class LinkedList{
    Node head;
    Node tail;
    public void insertAtTail(int val){
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
    public void insertAt(int idx, int val){
        Node tar = new Node(val);
        Node temp = head;
        if(idx==size()){
            insertAtTail(val);
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        tar.next = temp.next;
        temp.next = tar;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public int size(){
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
        return temp.val;
    }

    public void deleteAt(int idx) {
        Node temp = head;
        if (idx == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size()-1) tail = temp;
    }
}

public class DeleteNodeInLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtHead(10);
        l.insertAtTail(20);
        l.insertAtTail(30);
        l.insertAtTail(40);
        l.insertAtTail(50);
        l.insertAtTail(60);
        Node node = new Node(30);

        Node t = l.head;
        Node back = t;
        Node newNode = new Node(-1);
        while(t!=null || t.next!=null){
            if(t.next.val!=node.val){
                newNode.next = t.next.next;
                newNode = newNode.next;
            }
            t = t.next;
        }
        back.next = newNode;
        l.display();

    }

}
