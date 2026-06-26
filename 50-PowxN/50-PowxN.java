// Last updated: 6/26/2026, 10:37:08 AM
class Solution {
    public double pow(double x,long n){
        if(n==0) return (double) 1;
        if(n==1) return x;
        if(n%2==0){
            x *= x;
            n /= 2;
            return pow(x,n);
        }else{
            n -= 1;
            return x*pow(x,n);
        }
    }
    public double myPow(double x, long n) {
        if(n>=0) return pow(x,n);
        else return 1/pow(x,n*-1);
    }
}