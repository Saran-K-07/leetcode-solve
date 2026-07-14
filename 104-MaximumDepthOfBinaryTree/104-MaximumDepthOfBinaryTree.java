// Last updated: 14/7/2026, 10:05:43 am
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int fnl = 0;
        if(root==null) return fnl;
        return tra(root,fnl);
    }
    public int tra(TreeNode root,int fnl){
        fnl++;
        fnl = Math.max(fnl,Math.max((root.left!=null)?tra(root.left,fnl):0,(root.right!=null)?tra(root.right,fnl):0));
        return fnl;
    }
}