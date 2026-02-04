// Last updated: 2/4/2026, 2:16:10 PM
class Solution {
    public void dfs(char[][] board,int[] start,boolean[][] vist){
        int i = start[0];
        int j = start[1];
        vist[i][j] = true;
        int[][] child = {{i,j-1},{i,j+1},{i-1,j},{i+1,j}};
        for(int k=0;k<child.length;k++){
            i = child[k][0];
            j = child[k][1];
            if(i>=0 && j>=0 && i<board.length && j<board[0].length && !vist[i][j] && board[i][j]=='O'){
                dfs(board,new int[]{i,j},vist);
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean vist[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    if(board[i][j]=='O')
                    dfs(board, new int[]{i,j},vist);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vist[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
}