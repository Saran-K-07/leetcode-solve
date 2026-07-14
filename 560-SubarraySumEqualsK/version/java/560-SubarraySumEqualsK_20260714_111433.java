// Last updated: 14/7/2026, 11:14:33 am
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int sum;
4        int count = 0;
5        for(int i=0;i<nums.length;i++){
6            sum = 0;
7            for(int j=i;j<nums.length;j++){
8                sum = sum+nums[j];
9                if(sum==k) count++;
10            }
11        }
12        return count;
13    }
14}