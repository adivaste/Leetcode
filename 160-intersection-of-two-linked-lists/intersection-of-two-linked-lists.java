/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null){
            temp2 = headB;
            while(temp2 != null){
                if (temp2 == temp1) return temp2;
                temp2= temp2.next;
            }
            temp1 = temp1.next;
        }

        return null;
    }
}