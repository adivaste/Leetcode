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
    public ListNode partition(ListNode head, int x) {
        
        // Base case 
        if (head == null || head.next == null) return head;

        // Maintain two queue for smaller and larger elements
        ListNode before = new ListNode(-1);
        ListNode after = new ListNode(-1);

        // Temp pointer
        ListNode beforeCurr = before;
        ListNode afterCurr = after;

        // Traverse the entire linked list
        ListNode temp = head;
        while(temp != null){
            if (temp.val < x){
                beforeCurr.next = temp;
                beforeCurr = beforeCurr.next;
            }
            else{
                afterCurr.next = temp;
                afterCurr = afterCurr.next;
            }
            temp = temp.next;
        }

        // Join the two lists
        beforeCurr.next = after.next;
        afterCurr.next = null;
        return before.next;
    }
}