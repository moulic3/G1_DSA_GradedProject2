package com.lab.submission;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode root = new TreeNode(50);
	        root.left = new TreeNode(30);
	        root.right = new TreeNode(60);
	        root.left.left = new TreeNode(10);
	        root.right.left = new TreeNode(55);
	        
	        BSTToRightSkewedTree converter = new BSTToRightSkewedTree();
	        TreeNode skewedRoot = converter.convertToRightSkewedTree(root);
	        
	        System.out.print("Right-skewed tree in ascending order: ");
	        converter.displayRightSkewedTree(skewedRoot);
	       

	}

}
