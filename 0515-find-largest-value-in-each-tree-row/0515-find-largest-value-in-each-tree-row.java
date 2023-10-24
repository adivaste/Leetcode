/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;

        // Queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        // traverse - remove - insert 
        while(!queue.isEmpty()){

            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for(int i=0; i<size; i++){
                TreeNode peek = queue.poll();
                max = Math.max(max, peek.val);

                if (peek.left != null) queue.offer(peek.left);
                if (peek.right != null) queue.offer(peek.right);
            }

            answer.add(max);
        }

        return answer;
    }
}