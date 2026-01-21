// Last updated: 21/01/2026, 14:43:07
class Solution {
    public int[] sortedSquares(int[] nums) {
       int arr1[] = new int[nums.length];
        int i =0;
        int count = 0;
        int j=nums.length-1; 
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                arr1[count++] = nums[i]*nums[i++];
            }else if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr1[count++] = nums[j]*nums[j--];
            }else{
                arr1[count++] = nums[i]*nums[i++]; 
            }
        }
        for(int k=0; k<arr1.length/2; k++){
            int temp = arr1[k];
            arr1[k] = arr1[arr1.length-1-k];
            arr1[arr1.length-1-k] = temp;
        }
        return arr1;
    }
}