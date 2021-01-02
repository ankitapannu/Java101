package main;

import main.TreeNode;

public class LC938_RangeSumBST {

	// https://leetcode.com/problems/range-sum-of-bst/
	
	public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        sum += rangeSumBST(root.right, low, high);
        sum += rangeSumBST(root.left, low, high);
        return sum;
    }
}
