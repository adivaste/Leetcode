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
            // Check if the list is empty
    if (head == null) {
        return head;
    }

    // Temp pointer to traverse
    ListNode prev = null;
    ListNode temp = head;

    // Traverse the list
    while (temp != null) {
        // Flag
        boolean areRemoved = false;

        // Remove all other duplicates
        while (temp.next != null && temp.val == temp.next.val) {
            areRemoved = true;
            temp = temp.next;
        }

        // Delete the current node
        if (areRemoved) {
            if (prev != null) {
                prev.next = temp.next;
            } else {
                // If prev is null, it means we're removing duplicates from the head of the list
                head = temp.next;
            }
        } else {
            // Only update prev if no duplicates were removed
            prev = temp;
        }

        // Move to next node
        temp = temp.next;
    }


    return head;
    }
}