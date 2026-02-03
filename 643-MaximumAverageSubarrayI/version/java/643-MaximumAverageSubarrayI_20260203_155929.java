// Last updated: 03/02/2026, 15:59:29
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        // Code Here
4        int sum = 0;
5        int j = 0;
6        while(j<k){
7            sum += nums[j];
8            j++;
9        }
10        int i = 0;
11        double max = (double)sum/(double)k;
12        while(j<nums.length){
13            sum -= nums[i++];
14            sum += nums[j++];
15            double avg = (double)sum/(double)k;
16            if(avg>max){
17                max = avg;
18            }
19        }
20        return max;
21    }
22}