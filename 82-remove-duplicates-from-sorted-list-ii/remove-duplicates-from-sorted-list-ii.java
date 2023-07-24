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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            // Skip all nodes with duplicate values
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }

            // If duplicates are found, skip the entire group
            if (prev.next != current) {
                prev.next = current.next;
            } else {
                prev = current; // Move the previous pointer
            }

            current = current.next; // Move the current pointer
        }

        return dummy.next;
}

}