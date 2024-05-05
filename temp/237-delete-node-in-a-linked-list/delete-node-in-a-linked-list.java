/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        // Get the next node
        ListNode next = node.next;
        ListNode current = node;

        current.val = next.val;
        current.next = next.next;
    }
}