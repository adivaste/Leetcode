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
    public boolean hasCycle(ListNode head) {
        
        // Storing the node each time we visit
        Set<ListNode> hashset = new HashSet<ListNode>();
 
        ListNode temp = head;
        while(temp != null){
            if (hashset.contains(temp)) return true;
            hashset.add(temp);
            temp = temp.next;
        }
        return false;
    }
}