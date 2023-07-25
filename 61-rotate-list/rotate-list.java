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
        
        // Approach 1 : As we are rotating the linked list, anti clock wise
        // direction, so back elements will come back to the front, that means 
        // we have to connect the last node to front, and break the link from 
        // somewhere

        if (head == null || k==0) return head;

        // Point last to head
        ListNode temp = head;
        int size = 0;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        size++;
        temp.next = head;

        k = k%size;

        // Break the chain
        int  traversalsToMake = size - k - 1;
        temp = head;
        while(traversalsToMake != 0){
            temp = temp.next;
            traversalsToMake--;
        }

        // Modify next and head
        head = temp.next;
        temp.next = null;

        return head;
    }
}