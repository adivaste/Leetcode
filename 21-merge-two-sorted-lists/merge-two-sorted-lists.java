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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        // Answer : merge of two
        ListNode merged = new ListNode(-1);

        // Pointer for two ll for traversing
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode temp = merged;

        while(temp1 != null && temp2 != null){

            if (temp1.val < temp2.val){
                ListNode newNode = new ListNode(temp1.val);
                temp.next = newNode;
                temp = newNode;
                temp1 = temp1.next;
            }
            else{
                ListNode newNode = new ListNode(temp2.val);
                temp.next = newNode;
                temp = newNode;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null){
            while(temp2 != null){
                ListNode newNode = new ListNode(temp2.val);
                temp.next = newNode;
                temp = newNode;
                temp2 = temp2.next;
            }
        }

        if (temp2 == null){
            while(temp1 != null){
                ListNode newNode = new ListNode(temp1.val);
                temp.next = newNode;
                temp = newNode;
                temp1 = temp1.next;
            }
        }

        return merged.next;


    }
}