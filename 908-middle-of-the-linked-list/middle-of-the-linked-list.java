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
    public ListNode middleNode(ListNode head) {
        // Approach 1 : Traverse and find the length of the linked list 
        // then make half of the length and that many traversal need to 
        // make to reach the second middle

        // If length = 6 ==> 6/2 = 3 
        // If length = 5 ==> 5/2 = 2


        // Find the length
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        // Iterate that len/2 many times
        int noOfTraversals = length/2;
        temp = head;
        while(noOfTraversals != 0){
            temp = temp.next;
            noOfTraversals--;
        }

        return temp;

    }
}