// Last updated: 2/4/2026, 2:16:01 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Code Here
        int sum = 0;
        int j = 0;
        while(j<k){
            sum += nums[j];
            j++;
        }
        int i = 0;
        double max = (double)sum/(double)k;
        while(j<nums.length){
            sum -= nums[i++];
            sum += nums[j++];
            double avg = (double)sum/(double)k;
            if(avg>max){
                max = avg;
            }
        }
        return max;
    }
}