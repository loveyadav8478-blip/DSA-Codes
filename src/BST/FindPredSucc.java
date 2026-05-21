package BST;
import java.util.*;
public class FindPredSucc {
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
    public static List<Integer> inorder(Node root, List<Integer> ans){
        if(root==null) return ans;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        return ans;
    }
    public static void predAndSucc(Node root, List<Integer> ans, int target){
        int s = 0;
        int e = ans.size()-1;
        while(s<=e) {
            int mid = (s + e) / 2;
            if (ans.get(mid) == target) {
                System.out.println(mid);
                break;
            }
            else if (ans.get(mid) < target) s = mid + 1;
            else e = mid - 1;
        }
        System.out.println("Predesesor of "+target+" is : "+ans.get(s-1));
        System.out.println("Successor of "+target+" is : "+ans.get(s+1));
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","56","89","10","","28","","","","70","","","14"};
        Node root = constructbfs(arr);
        List<Integer> ans = new ArrayList<>();
        System.out.println(inorder(root,ans));
        predAndSucc(root,ans,14);
    }
}
