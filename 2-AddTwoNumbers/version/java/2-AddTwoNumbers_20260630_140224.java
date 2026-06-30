// Last updated: 6/30/2026, 2:02:24 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode p1 = l1;
14        ListNode p2 = l2;
15        ListNode l3 = new ListNode(0);
16        ListNode p3 = l3;
17        int carry = 0;
18        while(p1!=null && p2!=null){
19            int total = p1.val+p2.val+carry;
20            if(total/10!=0){
21                carry = total/10;
22                total %= 10;
23            }else carry = 0;
24            p3.next = new ListNode(total);
25            p1 = p1.next;
26            p2 = p2.next;
27            p3 = p3.next;
28        }
29        while(p1!=null){
30            int total = p1.val+carry;
31            if(total/10!=0){
32                carry = total/10;
33                total %= 10;
34            }else carry = 0;
35            p3.next = new ListNode(total);
36            p1 = p1.next;
37            p3 = p3.next;
38        }
39        while(p2!=null){
40            int total = p2.val+carry;
41            if(total/10!=0){
42                carry = total/10;
43                total %= 10;
44            }else carry = 0;
45            p3.next = new ListNode(total);
46            p2 = p2.next;
47            p3 = p3.next;
48        }
49        if(carry!=0) p3.next = new ListNode(carry);
50        return l3.next;
51    }
52}