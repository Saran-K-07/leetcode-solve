// Last updated: 02/02/2026, 21:20:57
1class Solution {
2    public void sortColors(int[] nums) {
3            int count0 = 0, count1 = 0, count2 = 0;
4            for(int i=0;i<nums.length;i++){
5                if(nums[i]==0){
6                    count0++;
7                }else if(nums[i]==1){
8                    count1++;
9                }else{
10                    count2++;
11                }
12            }
13            int i = 0;
14            while(count0!=0){
15                nums[i] = 0;
16                i++;
17                count0--;
18            }
19            while(count1!=0){
20                nums[i] = 1;
21                i++;
22                count1--;
23            }
24            while(count2!=0){
25                nums[i] = 2;
26                i++;
27                count2--;
28            }
29    }
30}