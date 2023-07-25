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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ArrayList<Integer> answer = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            answer.add(temp.val);
            temp = temp.next;
        }

        // boolean isPalindrome = true;
        int len = answer.size();
        for(int i=0; i<len/2; i++){
            if (answer.get(i) != answer.get(len-i-1)) {
                return false;
            }
        }
        return true;

    }
}