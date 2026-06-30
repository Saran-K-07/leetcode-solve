// Last updated: 6/30/2026, 3:57:15 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if(head==null) return null;
15        ListNode slow = head;
16        ListNode fast = head;
17        do{
18            if(slow.next==null) return null;
19            slow = slow.next;
20            if(fast.next==null || fast.next.next==null) return null;
21            fast = fast.next.next;
22        }while(slow!=fast);
23        fast = head;
24        while(slow!=fast){
25            slow = slow.next;
26            fast = fast.next;
27        }
28        return slow;
29    }
30}