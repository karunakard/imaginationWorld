package com.java.ds.ll;

public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode {
		
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void insertlast(int data) {
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	
	public void printListforward() {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void insertNodeAtStart(int data) {
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
		
	}
	
	public void printListBackward() {
		if(tail==null) {
			return;
		}
		ListNode temp=tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.previous;
		}
		System.out.println("null");
	}
	public void inserEleAtLast(int data) {
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
		}
		newNode=tail;
		length++;
	}
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
	    list.insertlast(10);
	    list.insertlast(20);
	    list.insertlast(30);
	    list.insertlast(40);
	    list.printListforward();
	    list.printListBackward();
	    System.out.println("insert at start");
	    list.insertNodeAtStart(1);
	    list.insertNodeAtStart(4);
	    list.printListforward();
	    list.printListBackward();
	    System.out.println("insert at last");
	    //list.inserEleAtLast(50);
	    //list.inserEleAtLast(70);
	    list.insertlast(50);
	    list.insertlast(70);
	    list.printListforward();
	    list.printListBackward();
	    
	    
	}

}
