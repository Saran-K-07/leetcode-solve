// Last updated: 14/7/2026, 10:05:40 am
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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return bal(root)!=-1;
    }

    public int bal(TreeNode root){
        if(root==null) return 0;
        int left = bal(root.left);
        int right = bal(root.right);
        int bt = Math.abs(left-right);
        if(bt>1 || left==-1 || right==-1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}