// Last updated: 21/01/2026, 14:43:26
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length;
        int i = 0,j = n*m-1;
        while(i<=j){
            int mid = (i+j)/2;
            int val = matrix[mid/n][mid%n];
            if(val==target){
                return true;
            }else if(val<target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return false;
    }
}