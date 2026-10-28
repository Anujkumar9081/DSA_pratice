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

        ListNode curr = head;
        ListNode prev = null;      // here the reversed stored 
        int count = 0;
        while(curr!=null){
            ListNode newList = new ListNode(curr.val);

            newList.next = prev;
              prev = newList;
            curr = curr.next;
            count++;
        }
        
       ListNode orginal  = head;
       ListNode reversed = prev;

       while(orginal!=null && reversed!=null){
        if(orginal.val!=reversed.val){
            return false;
        }
        orginal = orginal.next;
        reversed = reversed.next;
       }
       return true;
    }
}