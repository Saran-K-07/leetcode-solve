// Last updated: 6/30/2026, 11:37:40 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st =new Stack<>();
4        int num = 0;
5        char sign = '+';
6        for(int i=0;i<s.length();i++){
7            char ch = s.charAt(i);
8            if(Character.isDigit(ch)){
9                num = num*10+(ch-'0');
10            }
11            if((!Character.isDigit(ch) && ch!= ' ')||i==s.length()-1){
12                if(sign=='+'){
13                    st.push(num);
14                }
15                else if(sign=='-'){
16                    st.push(-num);
17                }
18                else if(sign=='*'){
19                    st.push(st.pop()*num);
20                }
21                else if(sign=='/'){
22                    st.push(st.pop()/num);
23                }
24                sign = ch;
25                num = 0;
26            }
27        }
28        int result = 0;
29        while(!st.isEmpty()){
30            result += st.pop();
31        }
32        return result;
33    }
34}