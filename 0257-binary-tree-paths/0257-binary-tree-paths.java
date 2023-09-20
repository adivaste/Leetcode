class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        findBinaryTreePaths(root, answer, new ArrayList<String>());
        return answer;
    }

    public void findBinaryTreePaths(TreeNode root, List<String> answer, ArrayList<String> output) {

        // Base case
        if (root == null) {
            return;
        }

        output.add(root.val + "");

        if (root.left == null && root.right == null) {
            // This is a leaf node, so we add the path to the answer list
            answer.add(String.join("->", output));
        } else {
            // Continue traversing the left and right subtrees
            findBinaryTreePaths(root.left, answer, output);
            findBinaryTreePaths(root.right, answer, output);
        }

        // Remove the last element to backtrack when moving up the tree
        output.remove(output.size() - 1);
    }
}
