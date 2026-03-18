// Last updated: 18/03/2026, 10:27:02
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
12    public ListNode rec(ListNode list1, ListNode list2){
13        ListNode tmp = new ListNode(0);
14        ListNode temp = tmp;
15        if(list1!=null && list2!=null){
16        if(list1.val<=list2.val){
17            tmp.next = list1;
18            tmp = tmp.next;
19            tmp.next = rec(list1.next,list2);
20        }else{
21            tmp.next = list2;
22            tmp = tmp.next;
23            tmp.next = rec(list1,list2.next);
24        }
25        }else if(list1!=null) tmp.next = list1;
26        else if(list2!=null) tmp.next = list2;
27        return temp.next;
28
29    }
30    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
31        if(list1==null && list2==null) return null;
32        if(list1==null) return list2;
33        if(list2==null) return list1;
34        return rec(list1,list2);
35    }
36}