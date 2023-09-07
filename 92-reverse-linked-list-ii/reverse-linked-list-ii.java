class Solution {

    public ListNode reverseList(ListNode startPoint, ListNode endPoint) {

        ListNode prev = null;
        ListNode curr = startPoint;
        ListNode next = startPoint;

        while (curr != endPoint) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        startPoint.next = endPoint.next;
        endPoint.next = prev; // Update endPoint's next to the new first node
        return endPoint;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        // Check for linked list
        if (head == null || head.next == null) return head;

        // Calculate the length
        int length = 0;
        ListNode prev = null;
        ListNode startPoint = null;
        ListNode endPoint = null;

        ListNode temp = head;
        while (temp != null) {
            length++;
            if (length == left - 1) prev = temp;
            if (length == left) startPoint = temp;
            if (length == right) endPoint = temp;
            temp = temp.next;
        }

        // Checks for Left and right
        if (left <= 0 || left > length || right <= 0 || right > length) return head;
        if (left >= right) return head;

        // Reverse in range
        if (prev != null) prev.next = reverseList(startPoint, endPoint);
        else {
            head = reverseList(startPoint, endPoint);
        }

        return head;
    }
}
