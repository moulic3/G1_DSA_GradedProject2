package com.lab.submission;

public class BSTToRightSkewedTree {

	TreeNode skewedRoot = null;
    TreeNode lastNode = null;
    
    public TreeNode convertToRightSkewedTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Recursively convert the left subtree
        convertToRightSkewedTree(root.left);
        
        // Modify the pointers to create the skewed tree
        if (skewedRoot == null) {
            skewedRoot = root;
            root.left = null;
            lastNode = root;
        } else {
            lastNode.right = root;
            root.left = null;
            lastNode = root;
        }
        
        // Recursively convert the right subtree
        convertToRightSkewedTree(root.right);
        
        return skewedRoot;
    }
    
    public  void displayRightSkewedTree(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
    
	
}
