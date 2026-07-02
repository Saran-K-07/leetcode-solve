// Last updated: 7/2/2026, 9:48:31 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode sortedArrayToBST(int[] nums) {
18        if(nums.length==0) return null;
19        int mid = (nums.length-1)/2;
20        TreeNode root = new TreeNode(nums[mid],sortedArrayToBST(Arrays.copyOfRange(nums,0,mid)),sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length)));
21        return root;
22    }
23}