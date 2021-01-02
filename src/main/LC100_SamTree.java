package main;

import main.TreeNode;

public class LC100_SamTree {

	// https://leetcode.com/problems/same-tree/
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        return false;
    }
}
