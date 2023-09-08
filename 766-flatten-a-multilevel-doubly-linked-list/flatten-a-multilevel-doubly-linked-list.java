/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        Node prev = head;

        Stack<Node> stack = new Stack<>();

        while(curr != null){
            if (curr.child != null){
                Node child = curr.child;
                if (curr.next != null){
                    stack.push(curr.next);
                    curr.next.prev = null;
                }
                curr.next = child;
                child.prev = curr;
                curr.child = null;
            }
            prev = curr;
            curr = curr.next;
        }

        while(!stack.isEmpty()){
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;
            while(curr != null){
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}