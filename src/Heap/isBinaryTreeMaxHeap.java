package Heap;
import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class isBinaryTreeMaxHeap {
    public boolean isCompleteTree(TreeNode root) {
        return isMaxHeap(root) && isCBT(root,1);
    }
    private int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private boolean isCBT(TreeNode root, int index) {
        if(root==null) return true;
        int s = size(root);
        if(s<index) return false;
        return isCBT(root.left, 2*index) && isCBT(root.right, 2*index+1);
    }

    private boolean isMaxHeap(TreeNode root) {
        if(root==null) return true;
        int lval = 0;
        int rval = 0;
        if(root.left!=null){
            lval = root.left.val;
        }
        else{
            lval = Integer.MIN_VALUE;
        }
        if(root.right!=null){
            rval = root.right.val;
        }
        else rval = Integer.MIN_VALUE;
        if(root.val<=lval || root.val<=rval) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}
