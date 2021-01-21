package main;

import java.util.ArrayList;

public class LC897_IncreasingOrderTree {

	public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorderTraversal(root, list);
        if (list.size() == 0) {
            return null;
        }
        TreeNode result = new TreeNode(list.get(0));
        TreeNode current = result;
        if (list.size() > 1) {
           for (int i = 1; i < list.size(); i++) {
                current.right = new TreeNode(list.get(i));
                current = current.right;
            } 
        }
        return result;
    }
    
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    
}
