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
        
        // Swap value with next node
        int nextData = node.next.val;
        node.next.val = node.val;
        node.val = nextData;

        // Delete the next node.
        node.next = node.next.next;
    }
}