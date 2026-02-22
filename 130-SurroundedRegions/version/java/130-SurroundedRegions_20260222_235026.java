// Last updated: 22/02/2026, 23:50:26
1class Solution {
2    public void dfs(char[][] board,int[] start,boolean[][] vist){
3        int i = start[0];
4        int j = start[1];
5        vist[i][j] = true;
6        int[][] child = {{i,j-1},{i,j+1},{i-1,j},{i+1,j}};
7        for(int k=0;k<child.length;k++){
8            i = child[k][0];
9            j = child[k][1];
10            if(i>=0 && j>=0 && i<board.length && j<board[0].length && !vist[i][j] && board[i][j]=='O'){
11                dfs(board,new int[]{i,j},vist);
12            }
13        }
14    }
15    public void solve(char[][] board) {
16        int m = board.length;
17        int n = board[0].length;
18        boolean vist[][] = new boolean[m][n];
19        for(int i=0;i<m;i++){
20            for(int j=0;j<n;j++){
21                if(i==0 || i==m-1 || j==0 || j==n-1){
22                    if(board[i][j]=='O')
23                    dfs(board, new int[]{i,j},vist);
24                }
25            }
26        }
27        for(int i=0;i<m;i++){
28            for(int j=0;j<n;j++){
29                if(!vist[i][j] && board[i][j]=='O'){
30                    board[i][j]='X';
31                }
32            }
33        }
34    }
35}