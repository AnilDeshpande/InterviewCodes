package com.datastructures.tree;

class TreeNode{
	int number;
	TreeNode leftLink;
	TreeNode rightLink;
}

public class Tree {
	
	private static int ROOT_VALUE=999999999;

	TreeNode rootNode;
	
	public Tree(){
		this.rootNode=new TreeNode();
		this.rootNode.number=ROOT_VALUE;
		this.rootNode.leftLink=null;
		this.rootNode.leftLink=null;
	}
	
	public void addToListofNode(){
		
	}
	
	public void addToRightOfNode(){
		
	}
	
	public int height(){
		return 0;
	}
	
}
