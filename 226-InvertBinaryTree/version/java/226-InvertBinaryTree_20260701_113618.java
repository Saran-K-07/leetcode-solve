// Last updated: 7/1/2026, 11:36:18 AM
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
17    public TreeNode invertTree(TreeNode root) {
18        if(root==null) return null;
19        if(root.left==null && root.right==null) return root;
20        TreeNode tmp = invertTree(root.left);
21        root.left = invertTree(root.right);
22        root.right = tmp;
23        return root;
24    }
25}