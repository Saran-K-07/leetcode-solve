// Last updated: 10/02/2026, 22:04:40
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[2][text2.length()+1];
4        for(int i=1;i<=text1.length();i++){
5            for(int j=1;j<=text2.length();j++){
6                if(text1.charAt(i-1)==text2.charAt(j-1)){
7                    dp[1][j] = dp[0][j-1] + 1;
8                }else{
9                    dp[1][j] = Math.max(dp[0][j],dp[1][j-1]);
10                }
11            }
12            dp[0] = dp[1];
13            dp[1] = new int[dp[1].length];
14        }
15        return dp[0][text2.length()];
16    }
17}