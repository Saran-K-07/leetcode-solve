// Last updated: 14/7/2026, 10:05:38 am
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        do{
            if(slow.next==null) return null;
            slow = slow.next;
            if(fast.next==null || fast.next.next==null) return null;
            fast = fast.next.next;
        }while(slow!=fast);
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}