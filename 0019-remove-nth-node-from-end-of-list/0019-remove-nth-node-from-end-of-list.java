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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Base case
        if (head == null) return head;

        // Dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        // Move "n" nodes forward
        while(n != 0){
            temp = temp.next;
            n--;
        }

        // Now introduce the new pointer from dummy node move until other 
        // pointer "temp" reach till "null"
        ListNode destroyer = dummy;
        while(temp.next != null){
            temp = temp.next;
            destroyer = destroyer.next;
        }

        // Remove the node
        destroyer.next = destroyer.next.next;
        return dummy.next;
    }
}