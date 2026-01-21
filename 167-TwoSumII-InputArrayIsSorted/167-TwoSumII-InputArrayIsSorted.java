// Last updated: 21/01/2026, 21:58:03
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i = 0;
4        int j = numbers.length-1;
5        while(i<j){
6            if(numbers[i]+numbers[j]==target){
7                return new int[]{i+1,j+1};
8            }else if(numbers[i]+numbers[j]<target){
9                i++;
10            }else{
11                j--;
12            }
13        }
14        return new int[]{-1,-1};
15    }
16}