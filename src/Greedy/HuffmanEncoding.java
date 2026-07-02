package Greedy;
import java.util.*;
public class HuffmanEncoding {
    class Node{
        int val;
        Node left;
        Node right;
        int idx;
        Node(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public void preorder(Node root, String sb, ArrayList<String> ans){
        if(root.left==null && root.right==null){
            if(sb.isEmpty()) sb = "0";
            ans.add(sb);
            return;
        }
        if(root.left!=null) preorder(root.left,sb+"0",ans);
        if(root.right!=null) preorder(root.right,sb+"1",ans);
    }
    public ArrayList<String> huffmanCodes(String s, int f[]) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.val != o2.val) return o1.val - o2.val;
            else return o1.idx - o2.idx;
        });
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i< f.length; i++){
            pq.add(new Node(f[i],i));
        }
        while(pq.size()>1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node(left.val+ right.val,Math.min(left.idx, right.idx));
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }
        Node root = pq.poll();
        preorder(root,"",ans);
        return ans;
    }
}
