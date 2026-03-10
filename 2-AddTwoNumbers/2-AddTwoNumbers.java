// Last updated: 10/03/2026, 20:22:01
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    ListNode l3 = new ListNode(0);
13    ListNode temp = l3;
14    int carry = 0;
15    public void addNumbers(ListNode l1, ListNode l2){
16        int d = l1.val+l2.val+carry;
17        if(d>9){
18            carry = d/10;
19            d = d%10;
20        }else{
21            carry = 0;
22        }
23        temp.next = new ListNode(d);
24        temp = temp.next;
25        if(l1.next!=null && l2.next!=null) addNumbers(l1.next,l2.next);
26        if(l1.next!=null && l2.next==null) addNumbers(l1.next,l2);
27        if(l1.next==null && l2.next!=null) addNumbers(l1,l2.next);
28    }
29    public void check(ListNode l1,ListNode l2){
30        ListNode tmp1 = l1;
31        ListNode tmp2 = l2;
32        while(tmp1.next!=null && tmp2.next!=null){
33            tmp1 = tmp1.next;
34            tmp2 = tmp2.next;
35        }
36        while(tmp1.next!=null){
37            tmp2.next = new ListNode(0);
38            tmp2 = tmp2.next;
39            tmp1 = tmp1.next;
40        }
41        while(tmp2.next!=null){
42            tmp1.next = new ListNode(0);
43            tmp1 = tmp1.next;
44            tmp2 = tmp2.next;
45        }
46    }
47    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
48        if(l1==null && l2==null) return null;
49        if(l1==null) return l2;
50        if(l2==null) return l1;
51        check(l1,l2);
52        addNumbers(l1,l2);
53        while(carry!=0){
54            int d = carry%10;
55            temp.next = new ListNode(d);
56            carry /= 10; 
57        }
58        return l3.next;
59    }
60}