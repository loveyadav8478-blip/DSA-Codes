package BinaryTrees;
import java.util.*;
public class ImplementationByStack {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static List<Integer> preorder(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (st.size()>0){
            Node node = st.pop();
            ans.add(node.val);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        return ans;
    }
    public static List<Integer> postorder(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (st.size()>0){
            Node node = st.pop();
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
            ans.add(node.val);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static List<Integer> inorder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(st.size()!=0 || node!=null){
            if (node!=null) {
                st.push(node);
                node = node.left;
            }
            else {
                node = st.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
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
        System.out.println(preorder(root));
        System.out.println(postorder(root));
        System.out.println(inorder(root));
    }
}
