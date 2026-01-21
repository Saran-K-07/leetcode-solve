// Last updated: 21/01/2026, 14:43:18
class Solution {
    public int next(int n){
        int sq = 0;
        while(n!=0){
            sq += (n%10)*(n%10);
            n = n/10;
        }
        return sq;
    }
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        int slow = n;
        int fast = next(n);
        while(slow!=fast){
            fast = next(fast);
            fast = next(fast);
            slow = next(slow);
            if(fast == 1 || slow == 1){
                return true;
            }
        }
        return false;
    }
}