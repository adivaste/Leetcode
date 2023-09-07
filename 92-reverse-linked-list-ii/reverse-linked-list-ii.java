public class Solution{
			
		public ListNode reverse(ListNode startingNode, ListNode endingNode){
				ListNode dummyNull = endingNode.next;
				
				ListNode prev = null;
				ListNode curr = startingNode;
				ListNode next;
				
				while(curr != dummyNull){
						next = curr.next;
						curr.next = prev;

						prev = curr;
						curr = next;
				}

				startingNode.next = dummyNull;
				return endingNode;			
		}
		public ListNode reverseBetween(ListNode head, int left, int right){
				// Check for linked list
				if (head == null || head.next == null) return head;
				
				// Check for left and right
				if (left >= right) return head;

				ListNode startingNode = null;
				ListNode endingNode = null;
				ListNode prev = null;
				
				ListNode temp = head;
				int count = 0;
				while(temp != null){
						count++;
						if (count == left - 1) prev = temp;
						if (count == left ) startingNode = temp;
						if (count == right ) endingNode = temp;
						temp = temp.next;
				}

				if (prev != null) prev.next = reverse(startingNode, endingNode);
				else head = reverse(startingNode, endingNode);
				return head;
		}
}