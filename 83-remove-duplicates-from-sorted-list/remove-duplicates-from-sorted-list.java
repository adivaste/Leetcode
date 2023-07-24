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
        
        // Approach 1 : Get the value of next node, if its same you
        // current then remove the next node, if not same otherwise go next

        ListNode temp = head;

        while(temp != null){
            if((temp.next != null) && (temp.val == temp.next.val)){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return head;

        
    }
}