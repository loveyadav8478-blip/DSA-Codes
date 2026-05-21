package BST;
import java.util.*;
public class DeleteNode {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node constructbfs(String[] arr){
        int  x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        int i = 1;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static Node delete2Child(Node root, int target){
        if(root==null) return null;
        if(root.val>target){
            if (root.left == null) return null;
            if(root.left.val==target){
                Node l = root.left;
                if(l.left==null && l.right==null) root.left=null;
                else if(l.left==null || l.right==null){
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
                else{
                    Node curr = l;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete2Child(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else delete2Child(root.left,target);
        }
        else{
            if (root.right == null) return null;
            if(root.right.val==target){
                Node r = root.right;
                if(r.left==null && r.right==null) root.right=null;
                else if(r.left==null || r.right==null){
                    if(r.left!=null) root.left = r.left;
                    else root.left = r.right;
                }
                else{
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete2Child(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else delete2Child(root.right,target);
        }
        return root;
    }
    public static void deleteNode(Node root, int target){
        if(root==null) return;
        if (root.val > target){
            if(root.left==null) return;
            if(root.left.val==target){
                Node l = root.left;
                if(l.left==null && l.right==null) root.left = null;
                else if(l.left==null || l.right==null){
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
            }
            else deleteNode(root.left,target);
        }
        else{
            if(root.right==null) return;
            if(root.right.val==target){
                Node r = root.right;
                if(r.left==null && r.right==null) root.right = null;
                else if(r.left==null || r.right==null){
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                }
            }
            else deleteNode(root.right,target);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","56","89","10","","28","","","","70","","","14"};
        Node root = constructbfs(arr);
        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
        Node ans = delete2Child(temp,50);
        System.out.println(ans.left);
//        preorder(root);
//        deleteNode(root,10);
//        System.out.println();
//        preorder(root);
    }
}
