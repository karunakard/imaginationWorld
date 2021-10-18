package com.java.ds.ll;

public class BinarySearchTree {
	
	private TreeNode root;
	
	
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
		}
	}
	
	public void insert(int value) {
		root=insert(root,value);
	}
	
	public TreeNode insert(TreeNode root,int value) {
		if(root==null) {
			root=new TreeNode(value);
			return root;
		}
		if(value<root.data) {
			root.left=insert(root.left,value);
		}else {
			root.right=insert(root.right,value);
		}
		return root;
	}
	
	public void print(TreeNode root) {
		if(root==null) {
			return;
		}
		print(root.left);
	    System.out.print(root.data+" ");
	    print(root.right);
	}
	
	public TreeNode searchKey(TreeNode root,int key) {
		if(root==null || root.data==key) {
			return root;
		}
		if(key<root.data) {
			return searchKey(root.left,key);
		}else {
			return searchKey(root.right,key);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(5);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);
		tree.insert(3);
		//tree.print(tree.root);
		TreeNode searchKey = tree.searchKey(tree.root, 4);
		System.out.println(searchKey.data);
		
	}
	
	

}
