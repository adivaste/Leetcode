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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed
        }

        // Calculate the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Perform k right rotations
        for (int i = 0; i < k % length; i++) {
            ListNode current = head;
            ListNode prev = null;

            // Move to the second-to-last node
            while (current.next != null) {
                prev = current;
                current = current.next;
            }

            // Move the last node to the front
            current.next = head;
            head = current;
            prev.next = null;
        }

        return head;
    }

}