// Last updated: 2/2/2026, 3:12:43 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while( i!=nums.length && nums[i]!=0){
            i++;
        }
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==0)
            continue;
            else{
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
}