package main;

import java.util.HashSet;
import main.TreeNode;

public class LC653_TwoSumBST {
	
	// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
	
	public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        dfs(root, set);
        if (set.size() <= 1) {
            return false;
        }
        for (int i : set) {
            int diff = k - i;
            if (set.contains(diff)) {
                return diff != i;
            }
        }
        return false;
    }
    
    public void dfs(TreeNode root, HashSet<Integer> set) {
        if (root != null) {
            set.add(root.val);
            dfs(root.left, set);
            dfs(root.right, set);
        }
    }
	
}
