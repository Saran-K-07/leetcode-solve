// Last updated: 11/03/2026, 16:23:01
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
12    public ListNode swapPair(ListNode head){
13        if(head==null) return null;
14        if(head!=null && head.next==null) return head;
15        ListNode tmp = head.next;
16        head.next = head.next.next;
17        tmp.next = head;
18        head = tmp;
19        head.next.next = swapPair(head.next.next);
20        return head;
21    }
22    public ListNode swapPairs(ListNode head) {
23        if(head==null) return null;
24        if(head.next==null) return head;
25        return swapPair(head);
26    }
27}