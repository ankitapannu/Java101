package main;

import main.TreeNode;

public class LC669_TrimBST {
	
	// https://leetcode.com/problems/trim-a-binary-search-tree/
	
	public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return root;
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        root.right = trimBST(root.right, low, high);
        root.left = trimBST(root.left, low, high);
        return root;
    }
}
