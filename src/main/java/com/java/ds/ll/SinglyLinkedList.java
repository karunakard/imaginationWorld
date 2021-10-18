package com.java.ds.ll;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static void printList(ListNode head) {
		ListNode current=head;
	   while(current!=null) {
		   System.out.println(current.data);
		   current=current.next;
	   }
	}
	
	public int findlength() {
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void addElementAtStart(int data) {
		ListNode newNode=new ListNode(data);
		//SinglyLinkedList list=new SinglyLinkedList();
		newNode.next=head;
		head=newNode;	
		printList(head);
	}
	
	public  void addElementAtEnd(int data) {
		ListNode newNode=new ListNode(data);
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		
		printList(head);
	}
	
	public  void addElementAtAnyPos(int position) {
		ListNode newnode=new ListNode(18);
		int length = findlength();
		//System.out.println(length);
		if(position==1) {
			newnode.next=head;
			head=newnode;
		}else if(position==length){
			ListNode newNode=new ListNode(20);
			ListNode current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
			
			
		}else {
			ListNode newNode=new ListNode(21);
			int start=1;
			ListNode previous=head;
			while(start<position-1) {
				previous=previous.next;
				start++;
			}
			ListNode current=previous.next;
			previous.next=newNode;
			newNode.next=current;	
			
		}
		printList(head);
		
		
	}
	
	public void deleteNodeAtStart() {
		ListNode current=head.next;
		head.next=null;
		head=current;
		printList(head);
		
	}
	
	public void deleteListAtend() {
		ListNode current=head;
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		printList(head);
		
	}
	
	public void deleteListNodeAnPos(int pos) {
		int length = findlength();
		ListNode previous=head;
		int start=1;
		while(start<pos-1) {
			previous=previous.next;
			start++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
		
		printList(head);
		
	}
	
	public boolean searchElemInLinkedList(int data) {
		ListNode current=head;
		while(current!=null) {
			if(current.data==data) {
				return true;
			}
			current=current.next;
		}
		return false;
		
	}
	
	public ListNode reverseLinkedList() {
		if(head==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode last=null;
		while(current!=null) {
			last=current.next;
			current.next=previous;
			previous=current;
			current=last;
			
		}
		return previous;
		
	}
	
	public ListNode findTheMiddleEleInTheList() {
		ListNode fastPtr=head;
		ListNode slowptr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowptr=slowptr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowptr;
		
	}
	
	public ListNode findThenthElementFromLast(int n) {
		
		if(head==null) {
			return head;
		}
		if(n<0) {
			throw new IllegalArgumentException();
		}
		int count=0;
		ListNode mainptr=head;
		ListNode refptr=head;
		while(count<n) {
			refptr=refptr.next;
			count++;
		}
		
		while(refptr!=null) {
			refptr=refptr.next;
			mainptr=mainptr.next;
		}
		
		return mainptr;
		
	}
	
	
	
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.head=new ListNode(10);
		ListNode first=new ListNode(11);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(6);
		ListNode fourth=new ListNode(7);
	   list.head.next=first;
	   first.next=second;
	   second.next=third;
	   third.next=fourth;
	   printList(list.head);
//	   System.out.println("=============");
//		int length = list.findlength();
//		
//		System.out.println(length);
//		System.out.println("================");
//		
//		list.addElementAtStart(1);
//		//printList(list.head);
//		System.out.println("===============");
//		list.addElementAtEnd(4);
//		
//		System.out.println("adding at any pos===========");
//		list.addElementAtAnyPos(4);
//		System.out.println("delete at start");
//		list.deleteNodeAtStart();
//		System.out.println("delete list at end");
//		list.deleteListAtend();
		//System.out.println("delete list at any pos");
		//list.deleteListNodeAnPos(3);
		//boolean searchElemInLinkedList = list.searchElemInLinkedList(11);
		//System.out.println(searchElemInLinkedList);
		//ListNode node = list.reverseLinkedList();
		//printList(node);
		
	    System.out.println("find middle element");
	    ListNode findTheMiddleEleInTheList = list.findTheMiddleEleInTheList();
	    System.out.println(findTheMiddleEleInTheList.data);
	    System.out.println("nth node from last");
	    ListNode findThenthElementFromLast = list.findThenthElementFromLast(3);
	    System.out.println(findThenthElementFromLast.data);
	    
		
		
		
	}

}
