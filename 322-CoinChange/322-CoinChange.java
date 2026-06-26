// Last updated: 6/26/2026, 10:36:51 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int INF = (int) 1e9;
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=amount;i++){
            dp[0][i] = INF;
        }
        for(int i=0;i<=coins.length;i++){
            dp[i][0] = 0;
        }
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(j<coins[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
            }
        }
        return dp[coins.length][amount]>=INF?-1:dp[coins.length][amount];
    }
}