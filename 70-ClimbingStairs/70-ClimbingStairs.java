// Last updated: 2/4/2026, 2:16:13 PM
class Solution {
    public int recStairs(int n,int[] dp){
        if(n==1){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        } 
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int ans = recStairs(n,dp);
        return ans;
    }
}