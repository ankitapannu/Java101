package main;

import main.TreeNode;

public class LC965_UnivaluedBinaryTree {

	// https://leetcode.com/problems/univalued-binary-tree/
	
    public boolean isUnivalTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        } 
        if (root.left != null && root.right != null && (root.val != root.left.val || root.val != root.right.val)) {
            return false;
        }
        if (root.left != null && root.right != null) {
           return root.val == root.left.val && root.val == root.right.val && isUnivalTree(root.left) && isUnivalTree(root.right); 
        }
        if (root.left != null && root.right == null) {
            return root.val == root.left.val && isUnivalTree(root.left);
        }
        return root.val == root.right.val && isUnivalTree(root.right);
    }
}
