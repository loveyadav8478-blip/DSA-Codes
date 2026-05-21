package BinaryTrees;
import java.util.*;
public class preInPost {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.right);
        preOrder(root.left);
    }
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static int Level(Node root){
        if(root==null) return 0;
        return Level(root)+Level(root.left)+Level(root.right);
    }
    public static void nthLevel2(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);
    }
    public static void bfs(Node root){
        Queue<Node> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(q.size()!=0){
            Node temp = q.remove();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
        }
    }
    public static int height(Node root){
        if(root.left==null || (root.left == null && root.right == null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void leftBoundry(Node root){
        if(root==null || (root.left==null && root.right==null)) return;
        System.out.print(root.val+" ");
        leftBoundry(root.left);
        if(root.left==null) leftBoundry(root.right);
    }
    public static void rightBoundry(Node root){
        if(root==null || (root.left==null && root.right==null)) return;
        rightBoundry(root.right);
        System.out.print(root.val+" ");
        if(root.right==null) rightBoundry(root.left);
    }
    public static void bottomBoundry(Node root){
        if (root==null || (root.left==null && root.right==null)) return;
        System.out.print(root.val+" ");
        bottomBoundry(root.left);
        bottomBoundry(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
//        bottomBoundry(root);
//        leftBoundry(root);
//        rightBoundry(root);
//        System.out.println(Level(root));
//        bfs(root);
//        int level = height(root)+1;
//        for (int i = 1; i <= level; i++) {
//            if (i%2 == 0) {
//                nthLevel(root,i);
//            }
//            else nthLevel(root,i);
//            System.out.println();
//        }
//        int level = height(root)+1;
//        for (int i = 1; i <= level; i++) {
//            nthLevel(root,i);
//            System.out.println();
//        }

    }
}
