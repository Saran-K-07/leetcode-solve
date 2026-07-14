// Last updated: 14/7/2026, 10:05:45 am
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> fnl = new ArrayList<>();
        if(root==null) return fnl;
        tra(root,fnl);
        return fnl;
    }
    public void tra(TreeNode root,List<Integer> fnl){
        if(root.left!=null) tra(root.left,fnl);
        fnl.add(root.val);
        if(root.right!=null) tra(root.right,fnl);
    }
}