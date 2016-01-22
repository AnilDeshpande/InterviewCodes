package com.datastructures.doublelinkedlist;


class DLNode{
	int number;
	DLNode forwardLink, backwardLink;
}


class DoubleLinkedList{
	
	private DLNode head;
	private DLNode	tail;
	
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
		head=new DLNode();
		head.number=999;
		head.forwardLink=null;
		head.backwardLink=null;
		
		tail=new DLNode();
		tail.number=999;
		tail.forwardLink=null;
		tail.backwardLink=null;
		
	}
	
	public void addNodeAtFirst(DLNode node) {
		node.forwardLink=head.forwardLink;
		head.forwardLink=node;
		node.backwardLink=head;
	}
	
	public void addNodeAtLast(DLNode node) {
		tail.forwardLink=node;
		node.backwardLink=tail;
		node.forwardLink=null;
		tail=node;
	}
	
	public void displayList() {
		DLNode tempNode=head;
		if(tempNode.forwardLink==null){
			System.out.println("Linked List is empty");
		}else{
			while (tempNode.forwardLink!=null) {
				System.out.println(""+tempNode.forwardLink.number);
				tempNode=tempNode.forwardLink;
			}
		}
	}
	
	
	
	
	private int size(){
		int size=0;
		DLNode tempNode=head;
		if(tempNode.forwardLink==null){
			size=0;
		}else{
			while (tempNode.forwardLink!=null) {
				tempNode=tempNode.forwardLink;
				size++;
			}
		}
		return size;
	}
	
}


public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		doubleLinkedList.displayList();
		
		DLNode dlNode=new DLNode();
		dlNode.number=100;
		doubleLinkedList.addNodeAtFirst(dlNode);
		
		
		DLNode dlNode1=new DLNode();
		dlNode1.number=200;
		doubleLinkedList.addNodeAtFirst(dlNode1);
		
		
		DLNode dlNode2=new DLNode();
		dlNode2.number=300;
		doubleLinkedList.addNodeAtLast(dlNode2);
		
		
		DLNode dlNode3=new DLNode();
		dlNode3.number=400;
		doubleLinkedList.addNodeAtLast(dlNode3);
		
		doubleLinkedList.displayList();
	}
	
}
