// Last updated: 6/26/2026, 10:37:11 AM
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
    public ListNode mergeLists(ListNode head1, ListNode head2){
        if(head1==null && head2==null) return null;
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(true){
            if(temp1.val<=temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
                temp.next = null;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
                temp.next = null;
            }
            if(temp1==null || temp2==null) break;
        }
        if(temp1!=null){
            temp.next = temp1;
        }
        if(temp2!=null){
            temp.next = temp2;
        }
        return ans.next;
    }
    public ListNode mergeSort(ListNode[] lists,int left, int right){
        if(left == right){
            return lists[left];
        }
        int mid = (left + right)/2;
        ListNode leftNode = mergeSort(lists,left,mid);
        ListNode rightNode = mergeSort(lists,mid+1,right);
        
        return mergeLists(leftNode,rightNode);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int left = 0;
        int right = lists.length-1;
        return mergeSort(lists,left,right);
    }
}