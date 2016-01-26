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
		tail=new DLNode();
		
		head.number=999;
		tail.number=999;
		
		head.forwardLink=tail;
		head.backwardLink=null;
		
		tail.forwardLink=null;
		tail.backwardLink=head;
		
	}
	
	public void addNodeAtFirst(DLNode node) {
		if(head.forwardLink==tail && tail.backwardLink==head){
			node.forwardLink=tail;
			node.backwardLink=head;
			head.forwardLink=node;
			tail.backwardLink=node;
		}else{
			node.forwardLink=head.forwardLink;
			node.backwardLink=head;
			head.forwardLink.backwardLink=node;
			head.forwardLink=node;
		}
	}
	
	public void addNodeAtLast(DLNode node) {
		if(tail.backwardLink==head){
			addNodeAtFirst(node);
		}else{
			node.backwardLink=tail.backwardLink;
			node.forwardLink=tail;
			tail.backwardLink.forwardLink=node;
			tail.backwardLink=node;
		}
		
	}
	
	public void displayList() {
		DLNode tempNode=head;
		if(tempNode.forwardLink==tail){
			System.out.println("Linked List is empty");
		}else{
			while (tempNode.forwardLink!=tail ) {
				System.out.println(""+tempNode.forwardLink.number);
				tempNode=tempNode.forwardLink;
			}
		}
	}
	
	public void displayLisyReversly() {
		DLNode temDlNode=tail;
		if(temDlNode.backwardLink==head){
			System.out.println("Linked List is empty");
		}else{
			while(temDlNode.backwardLink!=head){
				System.out.println(""+temDlNode.backwardLink.number);
				temDlNode=temDlNode.backwardLink;
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
		
		
		DLNode dlNode=new DLNode();
		dlNode.number=100;
		doubleLinkedList.addNodeAtLast(dlNode);
		
		DLNode dlNode1=new DLNode();
		dlNode1.number=200;
		doubleLinkedList.addNodeAtLast(dlNode1);
		
		doubleLinkedList.displayList();
		
	}
	
}
