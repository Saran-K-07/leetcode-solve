// Last updated: 6/30/2026, 12:35:54 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> st = new Stack<>();
4        Stack<StringBuilder> sbs = new Stack<>();
5        int k = 0;
6        StringBuilder sb = new StringBuilder();
7        for(int i=0;i<s.length();i++){
8            char c = s.charAt(i);
9            if(Character.isDigit(c)){
10                k=k*10+(c-'0');
11            }
12            else if(c=='['){
13                st.push(k);
14                sbs.push(sb);
15                k=0;
16                sb = new StringBuilder();
17            }else if(c==']'){
18                StringBuilder decode = sbs.pop();
19                for(int j=st.pop();j>=1;j--){
20                    decode.append(sb);
21                }
22                sb=decode;
23            }
24            else{
25                sb.append(c);
26            }
27        }
28        return sb.toString();
29    }
30}