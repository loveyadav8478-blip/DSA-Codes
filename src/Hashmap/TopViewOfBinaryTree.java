package Hashmap;
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
}
class Pair{
    int dist;
    Node root;
    Pair(Node root, int dist){
        this.dist = dist;
        this.root = root;
    }
}
public class TopViewOfBinaryTree {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair top = q.poll();
            Node node = top.root;
            int level = top.dist;
            if(!m.containsKey(level)){
                m.put(level, node.data);
            }
            if(node.left!=null) q.add(new Pair(node.left,level-1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        for(var a : m.values()){
            ans.add(a);
        }
        return ans;
    }
}
