// Last updated: 21/01/2026, 14:43:00
class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vist, int s, int d){
        vist[s] = true;
        for(int i=0;i<adj.get(s).size();i++){
            int child = adj.get(s).get(i);
            if(child==d){
                return true;
            }
            if(!vist[child]){
                if(dfs(adj,vist,child,d)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vist = new boolean[n];
        Arrays.fill(vist,false);
        return dfs(adj,vist,source,destination);
    }
}