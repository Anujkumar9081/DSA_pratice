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
    public boolean isPalindrome(ListNode head) {

       ListNode slow  = head;
       ListNode fast = head;
       // find the middle one and fast.next!=null is for odd case and fast!=null is for even case
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }

        // reversed half one 
       ListNode prev = null;
       ListNode curr = slow;
       while(curr!=null){
        ListNode curr1 = curr.next;
        curr.next = prev;
        prev = curr;
        curr = curr1;
       }

       // compare first part and second part that is aready reversed 
            ListNode first = head;
            ListNode second = prev;

            while(second!=null){
                if(first.val!=second.val){
                    return false;
                }
                first = first.next;
                second = second.next;
            }
        return true;
    }
}