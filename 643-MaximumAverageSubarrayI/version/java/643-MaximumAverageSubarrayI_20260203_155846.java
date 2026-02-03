// Last updated: 03/02/2026, 15:58:46
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        int j = 0;
5        while(j<k){
6            sum += nums[j];
7            j++;
8        }
9        int i = 0;
10        double max = (double)sum/(double)k;
11        while(j<nums.length){
12            sum -= nums[i++];
13            sum += nums[j++];
14            double avg = (double)sum/(double)k;
15            if(avg>max){
16                max = avg;
17            }
18        }
19        return max;
20    }
21}