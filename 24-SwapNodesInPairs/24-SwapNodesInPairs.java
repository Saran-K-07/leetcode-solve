// Last updated: 6/26/2026, 10:37:10 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPair(ListNode head){
        if(head==null) return null;
        if(head!=null && head.next==null) return head;
        ListNode tmp = head.next;
        head.next = head.next.next;
        tmp.next = head;
        head = tmp;
        head.next.next = swapPair(head.next.next);
        return head;
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        return swapPair(head);
    }
}