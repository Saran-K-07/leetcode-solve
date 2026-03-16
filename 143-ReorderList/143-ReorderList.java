// Last updated: 16/03/2026, 14:58:07
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
12    public ListNode rec(ListNode head,ListNode temp){
13        if(temp.next!=null){
14            head = rec(head,temp.next);
15            if(head!=null) temp.next = null;
16        }
17        if(head!=null && head!=temp && head.next!=null && head.next!=temp){
18            temp.next = head.next;
19            head.next = temp;
20            return temp.next;
21        }
22        return null;
23    }
24    public void reorderList(ListNode head) {
25        if(head==null || head.next==null || head.next.next==null) return;
26        ListNode temp1 = head;
27        ListNode temp2 = head;
28        rec(temp1,temp2);
29    }
30}