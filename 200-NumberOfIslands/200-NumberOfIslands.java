// Last updated: 21/01/2026, 14:43:20
class Solution {
    public void dfs(char[][] grid, int[] start, boolean[][] vist){
        int i = start[0];
        int j = start[1];
        vist[i][j] = true;
        int[][] child = {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            i = child[k][0];
            j = child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && !vist[i][j] && grid[i][j] == '1'){
                dfs(grid,new int[]{i,j},vist);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vist = new boolean[n][m];
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vist[i][j] && grid[i][j] == '1'){
                    dfs(grid,new int[]{i,j},vist);
                    answer++;
                }
            }
        }
        return answer;
    }
}