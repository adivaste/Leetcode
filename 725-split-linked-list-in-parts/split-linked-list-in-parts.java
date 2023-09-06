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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        // Find length
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int eachBucketNodes = length/k;
        int remainderNodes = length%k;


        ListNode[] answer = new ListNode[k];
        ListNode prev = null;
        temp = head;

        for(int i=0; i<k; i++){
            answer[i] = temp;
            for(int j=1; j<=eachBucketNodes + (remainderNodes > 0 ? 1 : 0); j++){
                prev = temp;
                temp = temp.next; 
            }
            if (prev != null) {
                prev.next = null; // Set the end of the current bucket to null
            }
            remainderNodes--;
        }
        return answer;

    }
}