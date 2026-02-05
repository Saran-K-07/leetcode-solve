// Last updated: 05/02/2026, 06:51:35
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length==1){
4            return nums[0];
5        }
6        int[] dp = new int[nums.length+1];
7        dp[1] = nums[0];
8        for(int i=2;i<=nums.length;i++){
9            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
10        }
11        System.out.println(Arrays.toString(dp));
12        return dp[nums.length];
13    }
14}