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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        // Base case
        if(head == null || head.next == null || k==1) return head;

        // Dummy node
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        // Begin : Used in reversing nodes
        ListNode begin = dummyHead;

        // Count 
        int count = 0;

        while(head != null){
            count++;
            if (count%k == 0){
                begin = reverse(begin, head.next); // Update begin for next k-group-reverse 
                // (as reverse() returns a "new" begin )
                head = begin.next;
            }
            else{
                head = head.next;
            }
        }

        return dummyHead.next;
    }

    public ListNode reverse(ListNode begin, ListNode end){
        ListNode prev = begin;
        ListNode curr = begin.next;
        ListNode next;
        ListNode first = curr;   // First supposed to store first element as backup

        while(curr != end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        begin.next = prev;
        first.next = curr;
        return first;
    }
}