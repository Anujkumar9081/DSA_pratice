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
    public int pairSum(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode curr1 = new ListNode(curr.val);

            curr1.next =  prev;
            prev = curr1;
            curr = curr.next;
        }

        int ans = Integer.MIN_VALUE;
        ListNode first = head;
        ListNode second = prev;
       
        ListNode fast  = head;
        
        while(fast!=null){
            int sum = first.val + second.val;
            ans = Math.max(sum , ans);
            fast = fast.next.next;
            first = first.next;
            second = second.next;
        }
return ans;
    }
}