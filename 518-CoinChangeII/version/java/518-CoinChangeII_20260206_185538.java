// Last updated: 06/02/2026, 18:55:38
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[][] dp = new int[coins.length+1][amount+1];
4        for(int i=0;i<=coins.length;i++){
5            dp[i][0] = 1;
6        }
7        for(int i=1;i<=coins.length;i++){
8            for(int j=1;j<=amount;j++){
9                if(j<coins[i-1]){
10                    dp[i][j] = dp[i-1][j];
11                }else{
12                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
13                }
14            }
15        }
16        return dp[coins.length][amount];
17    }
18}