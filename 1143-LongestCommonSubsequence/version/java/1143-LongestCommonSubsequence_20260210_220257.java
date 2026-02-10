// Last updated: 10/02/2026, 22:02:57
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[] prev = new int[text2.length()+1];
4        int[] curr = new int[text2.length()+1];
5        for(int i=1;i<=text1.length();i++){
6            for(int j=1;j<=text2.length();j++){
7                if(text1.charAt(i-1)==text2.charAt(j-1)){
8                    curr[j] = prev[j-1] + 1;
9                }else{
10                    curr[j] = Math.max(prev[j],curr[j-1]);
11                }
12            }
13            prev = curr;
14            curr = new int[curr.length];
15        }
16        return prev[text2.length()];
17    }
18}