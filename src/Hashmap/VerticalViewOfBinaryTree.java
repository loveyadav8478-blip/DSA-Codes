package Hashmap;
import java.util.*;
public class VerticalViewOfBinaryTree {
    class TreeNode{
        int val;
        TreeNode root;
        TreeNode left;
        TreeNode right;
    }
    class Solution {
        class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row = row;
                this.col = col;
            }
        }
        class ParPair{
            Pair pair;
            TreeNode node;
            ParPair(Pair pair, TreeNode node){
                this.pair = pair;
                this.node = node;
            }
        }
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            Map<Integer,List<Integer>> m = new TreeMap<>();
            Queue<ParPair> q = new LinkedList<>();
            q.add(new ParPair(new Pair(0,0),root));
            while(q.size()!=0){
                ParPair top = q.poll();
                Pair pair = top.pair;
                int row = pair.row;
                int col = pair.col;
                TreeNode node = top.node;
                if (!m.containsKey(col)) {
                    m.put(col, new ArrayList<>());
                }
                m.get(col).add(node.val);
                if(node.left!=null) q.add(new ParPair(new Pair(row+1,col-1),node.left));
                if(node.right!=null) q.add(new ParPair(new Pair(row+1,col+1),node.right));
            }
            for(var k : m.keySet()){
                List<Integer> temp = new ArrayList<>();
                List<Integer> value = m.get(k);
                Collections.sort(value);//////************ */
                int n = value.size();
                for(int i = 0;i < n; i++){
                    temp.add(value.get(i));
                }
                ans.add(temp);
            }
            return ans;
        }
    }
}
