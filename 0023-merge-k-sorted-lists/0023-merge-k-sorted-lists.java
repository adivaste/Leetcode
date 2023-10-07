class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node == null) continue;
            ListNode temp = node;
            do {
                queue.add(temp);
                temp = temp.next;
            } while (temp != null && temp != node);
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (!queue.isEmpty()) {
            ListNode curr = queue.poll();
            curr.next = null;

            temp.next = curr;
            temp = temp.next;
        }

        return dummy.next;
    }
}
