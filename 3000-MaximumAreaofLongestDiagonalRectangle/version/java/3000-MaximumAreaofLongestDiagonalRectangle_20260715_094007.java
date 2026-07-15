// Last updated: 15/7/2026, 9:40:07 am
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        double max = 0;
4        int d=0;
5        int maxArea = 0;
6        for(int i=0;i<dimensions.length;i++){
7            int l = dimensions[i][0];
8            int b = dimensions[i][1];
9            double diag = Math.sqrt((l*l)+(b*b));
10            if(diag>max){
11                max = diag;
12                d = i;
13            }else if(diag==max){
14                if(l*b>maxArea){
15                    maxArea = l*b;
16                    d = i;
17                }
18            }
19        }
20        return dimensions[d][0]*dimensions[d][1];
21    }
22}