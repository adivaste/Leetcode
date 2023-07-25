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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        // Get length of each list
        int len1 = getLength(l1);
        int len2 = getLength(l2);

        // Select for the answer
        ListNode temp = l1;
        ListNode answer = l2;

        if (len1 > len2){
            answer = l1;
            temp = l2;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = answer;


        // Traverse the "temp" to add in "answer"
        int sum = 0;
        int carry = 0;

        ListNode prev = answer;
        while(temp != null){
            sum = answer.val + temp.val + carry;

            if(sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;

            answer.val = sum;

            temp = temp.next;
            prev = answer;
            answer = answer.next;
        }

        while(answer != null){
            sum = answer.val + carry;

            if(sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;

            answer.val = sum;
            prev = answer;
            answer = answer.next;
        }

        if (carry == 1){
            prev.next = new ListNode(1);
        }

        return dummy.next;

        
    }

    public int getLength(ListNode list){
        int len = 0;
        if (list == null) return 0;
        while(list != null){
            len++;
            list = list.next;
        }
        return len;
    }

}