// Last updated: 10/02/2026, 20:08:24
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        if(obstacleGrid[0][0]==1) return 0;
4        int[] dp = new int[obstacleGrid[0].length];
5        dp[0] = 1;
6        for(int i=0;i<obstacleGrid.length;i++){
7            for(int j=0;j<obstacleGrid[0].length;j++){
8                System.out.println(Arrays.toString(dp));
9                if(obstacleGrid[i][j]==1){
10                    dp[j] = 0;
11                }else if(j>0){
12                    dp[j] = dp[j] + dp[j-1];
13                }
14            }
15        }
16        return dp[obstacleGrid[0].length-1];
17    }
18}