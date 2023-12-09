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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        findInorderTraversal(root,inorder);
        return inorder;
    }

    public void findInorderTraversal(TreeNode root, List<Integer> nodes){
        if(root == null) return;
        if (root.left != null) findInorderTraversal(root.left, nodes);
        nodes.add(root.val);
        if (root.right != null) findInorderTraversal(root.right, nodes);
    }
}