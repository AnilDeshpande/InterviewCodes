package com.datastructures.singlelinkedlist;

class Node{
	int number;
	Node link;
}

class LinkedList{
	Node head;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
		this.head=new Node();
		this.head.number=00;
		this.head.link=null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node temp=head;
		StringBuffer buffer=new StringBuffer();
		if(head.link==null){
			/*buffer.append("Linked list is empty");*/
		}else{
			while(temp.link!=null){
				int num=temp.link.number;
				/*buffer.append(""+num+" ");*/
				temp=temp.link;
			}
		}
		return buffer.toString();
	}
	
	public LinkedList addItemToLinkedList(Node node){
		if(this.head.link==null){//list is empty
			this.head.link=node;
			node.link=null;
			return this;
		}else{
			Node temp=this.head;
			while(temp.link!=null){
				temp=temp.link;
			}
			temp.link=node;
			node.link=null;
			return this;
		}
	}
	
	public LinkedList addAtNthPosition(Node node, int position){
		if(position>this.size()){
			System.out.println("Position mentioned is more than size, thus can not be added");
		}else if(position==this.size()){
			addItemToLinkedList(node);
			
		}else{
			Node temp=this.head;
			int count=0;
			while(temp.link!=null && count<position-1){
				count++;
				temp=temp.link;
			}
			node.link=temp.link;
			temp.link=node;
		}
		return this;
	}
	
	public int size(){
		
		int size=0;
		if(head.link==null){
			size=0;
		}else{
			Node temp=this.head;
			while(temp.link!=null){
				size++;
				temp=temp.link;
			}
		}	
		return size;
	}	
}

public class SingleLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		
		Node node1=new Node();
		node1.number=100;
		linkedList.addItemToLinkedList( node1);
		
		Node node2=new Node();
		node2.number=200;
		linkedList.addItemToLinkedList( node2);
		
		Node node3=new Node();
		node3.number=300;
		linkedList.addItemToLinkedList( node3);
		
		Node node4=new Node();
		node4.number=400;
		linkedList.addItemToLinkedList( node4);
		
		Node node5=new Node();
		node5.number=500;
		linkedList.addItemToLinkedList( node5);
		
		System.out.println("Linked List "+linkedList);
		System.out.println("Size: "+linkedList.size());
		
		Node node6=new Node();
		node6.number=600;
		linkedList.addAtNthPosition(node6, 5);
		
		System.out.println("Linked List "+linkedList);
		System.out.println("Size: "+linkedList.size());
	}
}
