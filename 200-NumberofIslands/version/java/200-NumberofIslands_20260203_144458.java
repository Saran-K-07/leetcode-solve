// Last updated: 03/02/2026, 14:44:58
1class Solution {
2    public void dfs(char[][] grid,int[] start, boolean[][] vist){
3        int i = start[0];
4        int j = start[1];
5        vist[i][j] = true;
6        int[][] child = {{i-1,j},{i+1,j},{i,j-1},{i,j+1}};
7        for(int k=0;k<child.length;k++){
8            i = child[k][0];
9            j = child[k][1];
10            if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]=='1' && !vist[i][j]){
11                dfs(grid,new int[]{i,j},vist);
12            }
13        }
14    }
15    public int numIslands(char[][] grid) {
16        int m = grid.length;
17        int n = grid[0].length;
18        boolean[][] vist = new boolean[m][n];
19        int ans = 0;
20        for(int i=0;i<m;i++){
21            for(int j=0;j<n;j++){
22                if(!vist[i][j] && grid[i][j]=='1'){
23                    dfs(grid,new int[]{i,j},vist);
24                    ans++;
25                }
26            }
27        }
28        return ans;
29    }
30}