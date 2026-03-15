// Last updated: 15/03/2026, 13:25:58
1class Solution {
2    public double pow(double x,long n){
3        if(n==0) return (double) 1;
4        if(n==1) return x;
5        if(n%2==0){
6            x *= x;
7            n /= 2;
8            return pow(x,n);
9        }else{
10            n -= 1;
11            return x*pow(x,n);
12        }
13    }
14    public double myPow(double x, long n) {
15        if(n>=0) return pow(x,n);
16        else return 1/pow(x,n*-1);
17    }
18}