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
        
        if(head == null || head.next == null || k == 0) return head;
        
        // Calculate the size of linked list
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        // Optimise using length
        k = k % length;
        
        // If k is 0, no rotation needed
        if (k == 0) return head;

        // Nodes to traverse
        int nodesToTraverse = length - k;

        // Use dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        temp = dummy;
        
        while(nodesToTraverse != 0){
            temp = temp.next;
            nodesToTraverse--;
        }

        ListNode tempHead = temp.next;
        temp.next = null;

        ListNode curr = tempHead;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = dummy.next;
        return tempHead;
    }
}
