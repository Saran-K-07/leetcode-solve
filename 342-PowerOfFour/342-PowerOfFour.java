// Last updated: 21/01/2026, 14:43:11
class Solution {
    public boolean isPowerOfFour(int n) {
        int count = 0;
        if( (n&n-1) == 0 && n!=0){
           while(n!=0){
            if((n&1)==1)
            break;
            count++;
            n = n>>1;
           }
        }else{
        return false;
        }
        return count%2==0;
    }
}