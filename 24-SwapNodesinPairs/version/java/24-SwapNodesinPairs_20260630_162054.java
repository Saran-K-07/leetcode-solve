// Last updated: 6/30/2026, 4:20:54 PM
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
12    public ListNode swapPairs(ListNode head) {
13        if(head==null) return null;
14        if(head!=null && head.next==null) return head;
15        ListNode tmp = head.next;
16        head.next = swapPairs(tmp.next);
17        tmp.next = head;
18        return tmp;
19    }
20}