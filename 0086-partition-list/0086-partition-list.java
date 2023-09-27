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
        Queue<Integer> smaller = new LinkedList<Integer>();
        Queue<Integer> greater = new LinkedList<Integer>();

        // Temp pointer
        ListNode temp = head;

        // Traverse and insert into queue
        while(temp != null){
            if (temp.val < x ) smaller.offer(temp.val);
            else greater.offer(temp.val);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            if (!smaller.isEmpty()) temp.val = smaller.poll();
            else temp.val = greater.poll();
            temp = temp.next;
        }

        return head;
    }
}