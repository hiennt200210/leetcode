import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    /**
     * 94. Binary Tree Inorder Traversal
     * (https://leetcode.com/problems/binary-tree-inorder-traversal/)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        
        TreeNode current = root;
        Stack<TreeNode> parents = new Stack<>();
        List<Integer> result = new ArrayList<>();

        while (current != null  || !parents.isEmpty()) {

            // Move to the leftmost child node
            while (current != null) {
                parents.push(current);
                current = current.left;
            }

            // Traverse the parent node
            current = parents.pop();
            result.add(current.val);
            
            // Move to right child node
            current = current.right;
        }
        
        return result;
    }

}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}