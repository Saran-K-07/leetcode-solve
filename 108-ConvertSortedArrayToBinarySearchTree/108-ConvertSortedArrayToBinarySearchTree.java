// Last updated: 14/7/2026, 10:05:42 am
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        int mid = (nums.length-1)/2;
        TreeNode root = new TreeNode(nums[mid],sortedArrayToBST(Arrays.copyOfRange(nums,0,mid)),sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length)));
        return root;
    }
}