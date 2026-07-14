// Last updated: 14/7/2026, 10:06:01 am
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x==rev(x);
    }
    int val = 0;
    public int rev(int x){
        while(x!=0){
        val = (val*10)+(x%10);
        x/=10;
        }
        return val;
    }
}