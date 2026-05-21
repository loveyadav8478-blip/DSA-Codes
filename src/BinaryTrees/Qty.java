package BinaryTrees;

public class Qty {
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
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return sum(root.left)+sum(root.right)+root.val;
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int min(Node root){
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static long product(Node root) {
        if (root == null) return 1L;
        return (long) root.val * product(root.left) * product(root.right);
    }
    public static int height(Node root){
        if(root.left==null || (root.left == null && root.right == null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        root.left = a;
        root.right = b;
        Node c = new Node(40);
        Node d = new Node(50);
        a.left = c;
        a.right = d;
        Node e = new Node(60);
        Node f = new Node(70);
        b.right = e;
        b.left = f;
//        preOrder(root);
//        System.out.println();
//        System.out.println(size(root));
//        System.out.println(sum(root));
//        System.out.println(max(root));
//        System.out.println(min(root));
//        System.out.println(height(root));
        System.out.println(product(root));
    }
}
