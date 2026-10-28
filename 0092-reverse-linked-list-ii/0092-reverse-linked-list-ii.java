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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
       ListNode temp = null;
       ListNode curr = head;
       for(int i = 1; i<=left-1; i++){
        temp = curr;
        curr = curr.next;
       }

       ListNode start = curr;
       ListNode prev = temp;

       while(left<=right){
        ListNode curr1 = curr.next;
        curr.next = prev;

        prev = curr;
        curr = curr1;
        left++;
       }
       start.next = curr;
        if(temp==null){
            return prev;
        }
        temp.next = prev;
        return head;
    }
}