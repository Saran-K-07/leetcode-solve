// Last updated: 6/26/2026, 10:36:48 AM
class Solution {
    public void reverse(char[] s, int i, int j){
        if(i>=j) return;
        else{
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            reverse(s,++i,--j);
        }
    }
    public void reverseString(char[] s) {
        if(s.length==0) return;
        reverse(s,0,s.length-1);
    }
}