// Last updated: 6/26/2026, 10:36:42 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[2][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[1][j] = dp[0][j-1] + 1;
                }else{
                    dp[1][j] = Math.max(dp[0][j],dp[1][j-1]);
                }
            }
            dp[0] = dp[1];
            dp[1] = new int[dp[1].length];
        }
        return dp[0][text2.length()];
    }
}