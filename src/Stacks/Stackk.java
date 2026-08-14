package Stacks;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class Stackk {
//    int size = 0;
//    int[] arr = new int[5];
//    int i = 0;
//    void push(int x){
//        if(size==arr.length) return;
//        arr[i++] = x;
//        size++;
//    }
//    int pop(){
//        if(size==0) {
//            System.out.println("Underflow..");
//            return -1;
//        }
//        int top = arr[i];
//        i--;
//        size--;
//        return top;
//    }
//    int peek(){
//        if(size==0) {
//            System.out.println("Underflow..");
//            return -1;
//        }
//        return arr[i];
//    }
//    void display(){
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
    Node prev = null;
    Node head = null;
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    int size = 0;

    void push(Node head, int x){
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        newNode.prev = head;
        head.next = newNode;
        prev = head;
        head = newNode;
        size++;
    }

    int pop(Node head){
        if(head==null) return -1;
        int val = head.val;
        head = head.prev;
        if(head!=null){
            head.next = null;
        }
        size--;
        return val;
    }
    int peek(Node head){
        if(head==null) return -1;
        return head.val;
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.add(3);
        q.add(9);
        System.out.println(q.poll());
        q.add(1);
        q.remove(1);
        System.out.println(q.poll());
        System.out.println(q.size());

//        Stackk s = new Stackk();
//        Node head = new Node(1);
//
//        s.push(head,2);
//        s.push(head,3);
//        s.push(head,4);
//        s.push(head,5);
//        s.push(head,6);
//        System.out.println(s.size);
//        s.pop(head);
//        s.pop(head);
//        s.pop(head);
//        System.out.println(s.size);
    }
}
