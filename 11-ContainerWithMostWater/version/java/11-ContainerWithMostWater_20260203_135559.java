// Last updated: 03/02/2026, 13:55:59
1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0;
4        int j = height.length-1;
5        int max = 0;
6        while(i<j){
7            int area = Math.min(height[i],height[j])*(j-i);
8            if(area>max){
9                max = area;
10            }
11            if(height[i]<height[j]){
12                i++;
13            }else{
14                j--;
15            }
16        }
17        return max;
18    }
19}