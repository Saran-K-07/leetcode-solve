// Last updated: 14/7/2026, 10:07:03 am
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i = 0;
4        int j = i+1;
5        while(j<nums.length){
6            if(nums[i]!=0){
7                i++;
8                j++;
9            }else{
10                if(nums[j]==0) j++;
11                else{
12                    int temp = nums[i];
13                    nums[i] = nums[j];
14                    nums[j] = temp;
15                    i++;
16                    j = j+1;
17                }
18            }
19        }
20    }
21}