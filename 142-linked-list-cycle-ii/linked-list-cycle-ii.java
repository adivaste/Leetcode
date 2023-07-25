/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // Use hashset
        HashSet<ListNode> hashset = new HashSet<>();

        ListNode temp = head;
        while(temp != null && temp.next != null){
            if (hashset.contains(temp)) return temp;
            hashset.add(temp);
            temp = temp.next;
        }

        return null;
    }
}