package com.java.ds.ll;

public class CircularSinglyLinkedList {
	
	private ListNode last;
	private int length;
	
	private class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
			length++;
		}
		
	}
	public CircularSinglyLinkedList() {
		last=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public void print() {
		ListNode temp=last.next;
		while(temp!=last) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		
		
	}
	
	public void insertNodeAtStart() {
		ListNode newNode=new ListNode(5);
		ListNode first=last.next;
		newNode.next=first;
		last.next=newNode;
	}
	
	public void insertNodeAtLast() {
		ListNode newNode=new ListNode(6);
		ListNode temp=last.next;
		last.next=newNode;
		newNode.next=temp;;
		last=newNode;
	}
	
	public void removefirst() {
		
		ListNode temp=last.next;
		if(last.next!=last) {
			last=null;
		}else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
	}
	
	
	
	public void createCircularLinkedList() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		last=fourth;
		
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList clist=new CircularSinglyLinkedList();
		clist.createCircularLinkedList();
		clist.print();
		clist.insertNodeAtStart();
		clist.print();
		System.out.println();
		clist.insertNodeAtLast();
		clist.print();
		System.out.println(clist.length());
		clist.removefirst();
		System.out.println(clist.length());
	}

}
