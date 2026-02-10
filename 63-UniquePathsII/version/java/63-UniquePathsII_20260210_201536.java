// Last updated: 10/02/2026, 20:15:36
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        if(obstacleGrid[0][0]==1) return 0;
4        int[] dp = new int[obstacleGrid[0].length];
5        dp[0] = 1;
6        for(int i=0;i<obstacleGrid.length;i++){
7            for(int j=0;j<obstacleGrid[0].length;j++){
8                if(obstacleGrid[i][j]==1){
9                    dp[j] = 0;
10                }else if(j>0){
11                    dp[j] = dp[j] + dp[j-1];
12                }
13            }
14        }
15        return dp[obstacleGrid[0].length-1];
16    }
17}