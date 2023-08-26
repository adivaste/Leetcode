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
    public TreeNode sortedArrayToBST(int[] nums) {
        // Base condition...
        if (nums.length == 0)
			return null;
        // Call the function recursively...
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}
    // Create another function which will convert any particular range of given nums array...
    // & return its corresponding BST root node....
	public TreeNode sortedArrayToBST(int[] nums, int beg, int end) {
        // If beg > end, return NULL, as we receive a wrong range...
		if (beg > end)
			return null;
        // set the middle node...
		int mid = (beg + end) / 2;
        // Initialise root node with value same as nums[mid]...
		TreeNode root = new TreeNode(nums[mid]);
        // Assign left subtrees as the same function called on left subranges...
		root.left = sortedArrayToBST(nums, beg, mid - 1);
        // Assign right subtrees as the same function called on right subranges...
		root.right = sortedArrayToBST(nums, mid + 1, end);
        // Return the root node...
		return root;
    }
}