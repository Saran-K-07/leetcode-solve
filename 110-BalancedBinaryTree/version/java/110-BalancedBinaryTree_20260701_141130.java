// Last updated: 7/1/2026, 2:11:30 PM
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
17    public boolean isBalanced(TreeNode root) {
18        if(root==null) return true;
19        return bal(root)!=-1;
20    }
21
22    public int bal(TreeNode root){
23        if(root==null) return 0;
24        int left = bal(root.left);
25        int right = bal(root.right);
26        int bt = Math.abs(left-right);
27        if(bt>1 || left==-1 || right==-1){
28            return -1;
29        }
30        return Math.max(left,right)+1;
31    }
32}