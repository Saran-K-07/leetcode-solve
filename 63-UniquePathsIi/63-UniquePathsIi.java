// Last updated: 6/26/2026, 10:37:03 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        int[] dp = new int[obstacleGrid[0].length];
        dp[0] = 1;
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    dp[j] = 0;
                }else if(j>0){
                    dp[j] = dp[j] + dp[j-1];
                }
            }
        }
        return dp[obstacleGrid[0].length-1];
    }
}