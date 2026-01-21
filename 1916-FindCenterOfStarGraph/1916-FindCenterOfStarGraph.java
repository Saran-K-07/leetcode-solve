// Last updated: 21/01/2026, 14:42:58
class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        else{
            return edges[0][1];
        }
    }
}