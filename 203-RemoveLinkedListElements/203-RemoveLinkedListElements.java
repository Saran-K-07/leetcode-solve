// Last updated: 18/03/2026, 15:12:12
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
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null) return null;
14        if(head.next!=null) head.next = removeElements(head.next,val);
15        if(head.val==val) return head.next;
16        else return head;
17    }
18}