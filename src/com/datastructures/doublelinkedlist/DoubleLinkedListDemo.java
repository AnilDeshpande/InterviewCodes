package com.datastructures.doublelinkedlist;


class DLNode{
	int number;
	DLNode forwardLink, backwardLink;
}


class DoubleLinkedList{
	
	private DLNode head;
	private DLNode	tail;
	
	private int size;
	
	public int getSize() {
		return this.size>0?this.size-1:0;
	}
	
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
		size=0;
		
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
		size++;
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
		size++;
	}
	
	public void removeFirstNode(){
		if(head.forwardLink==tail && tail.backwardLink==head){
			System.out.println("List is empty, no node to remove");
		}else{
			DLNode dlNode=head.forwardLink;
			System.out.println("Node being removed: "+dlNode.number);
			head.forwardLink=dlNode.forwardLink;
			head.forwardLink.backwardLink=dlNode.backwardLink;
			dlNode=null;
			size--;
		}
	}
	
	public void removeLastNode() {
		if(head.forwardLink==tail && tail.backwardLink==head){
			System.out.println("List is empty, no node to remove");
		}else{
			DLNode dlNode=tail.backwardLink;
			System.out.println("Node being removed: "+dlNode.number);
			tail.backwardLink=dlNode.backwardLink;
			tail.backwardLink.forwardLink=dlNode.forwardLink;
			dlNode=null;
			size--;
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
	
	public void addNodeAtPosition(DLNode node, int position){
		if(getSize()==0){
			System.out.println("The list id empty");
		}else if (position>getSize()){
			System.out.println("The "+position+" is not available for adding the node "+node.number);
		}else{
			DLNode temp=head;
			for(int i=0;i<position-1;i++){
				temp=temp.forwardLink;
			}
			node.forwardLink=temp.forwardLink;
			node.backwardLink=temp;
			temp.forwardLink.backwardLink=node;
			temp.forwardLink=node;
			size++;
		}
	}
	
	public void removeNodeFromPosition(int position) {
		if(getSize()==0){
			System.out.println("The list id empty");
		}else if (position>getSize()){
			System.out.println("The "+position+" is not available for removing");
		}else{
			DLNode temp=head;
			for(int i=0;i<position;i++){
				temp=temp.forwardLink;
			}
			temp.backwardLink.forwardLink=temp.forwardLink;
			temp.forwardLink.backwardLink=temp.backwardLink;
			System.out.println("The "+temp.number+" removed from position "+position);
			size--;
		}
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
		
		DLNode dlNode2=new DLNode();
		dlNode2.number=300;
		doubleLinkedList.addNodeAtFirst(dlNode2);
		
		
		
		doubleLinkedList.displayList();
		System.out.println("Size of the list: "+doubleLinkedList.getSize());
		
		doubleLinkedList.addNodeAtPosition(new DLNode(), 2);
		
		doubleLinkedList.displayList();
		System.out.println("Size of the list: "+doubleLinkedList.getSize());
		
		doubleLinkedList.removeNodeFromPosition(2);
		
		doubleLinkedList.displayList();
		System.out.println("Size of the list: "+doubleLinkedList.getSize());
	}
	
}
