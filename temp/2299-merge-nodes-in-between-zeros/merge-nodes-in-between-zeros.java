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
    public ListNode mergeNodes(ListNode head) {
        
        /* # Thought process
        1. Set head to first element
        2. Check next element is ZERO or NON-ZERO
            - if YES : move the head to next
            - else if NON-ZERO : add the value in current node and remove next node
            - else if NULL : use maintained PREV pointer to remove current node
        */

        ListNode prev = null;
        ListNode curr = head;

        while(curr.next != null){
            if(curr.next.val != 0){
                curr.val += curr.next.val;
                curr.next = curr.next.next;
            }
            else{
                prev = curr;
                curr =  curr.next;
            }
        }

        prev.next = null;
        return head;
    }
}