package Heap;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    public class BstToMAXHEAP {
        static int index;
        public static void inorder(Node root, List<Integer> temp){
            if(root==null) return;
            inorder(root.left,temp);
            temp.add(root.data);
            inorder(root.right,temp);
        }
        public static void postOrder(List<Integer> temp, Node root){
            if(root==null) return;
            postOrder(temp,root.left);
            postOrder(temp,root.right);
            root.data = temp.get(index++);
        }
        public static void convertToMaxHeapUtil(Node root) {
            List<Integer> temp = new ArrayList<>();
            inorder(root,temp);
            index = 0;
            postOrder(temp,root);
        }
}
}
