// Last updated: 21/01/2026, 14:43:15
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}