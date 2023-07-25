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

        ListNode answer = new ListNode(-1);

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int sum = 0;
        int carry = 0;

        ListNode temp = answer;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + carry;
            if (sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            else{
                carry = 0;
            }
                        
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = newNode;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 == null && temp2 != null){
            sum = temp2.val + carry;
            if (sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;
            
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = newNode;
            temp2 = temp2.next;
        }

        while (temp2 == null  && temp1 != null){
            sum = temp1.val + carry;
            if (sum > 9){
                carry = sum/10;
                sum = sum%10;
            }
            else carry = 0;
            
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = newNode;
            temp1 = temp1.next;
        }

        if (temp1 == null && temp2 == null && carry == 1) temp.next = new ListNode(1);

        return answer.next;

        
    }
}