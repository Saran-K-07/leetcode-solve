// Last updated: 03/02/2026, 15:57:30
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        double max = 0.00d;
5        int j = 0;
6        if(nums.length==1){
7            return (double)nums[0];
8        }
9        while(j<k){
10            sum += nums[j];
11            j++;
12        }
13        int i = 0;
14        max = (double)sum/(double)k;
15        while(j<nums.length){
16            sum -= nums[i++];
17            sum += nums[j++];
18            double avg = (double)sum/(double)k;
19            if(avg>max){
20                max = avg;
21            }
22        }
23        return max;
24    }
25}