package main;

import main.TreeNode;

public class LC101_SymmetricTree {

	// https://leetcode.com/problems/symmetric-tree/
	
	public boolean isSymmetric(TreeNode root) {
        return compare(root, root); 
    }
    
    public boolean compare(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return compare(root1.left, root2.right) && compare(root1.right, root2.left);
        }
        return false;
    }
}
