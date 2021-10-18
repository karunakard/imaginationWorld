package com.java.ds.ll;

public class SortedSinglyLinkList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
		
		
	}
	
	public void printList() {
		ListNode current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void removeDuplicates() {
		ListNode current=head;
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		SortedSinglyLinkList list=new SortedSinglyLinkList();
		list.head=new ListNode(1);
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		list.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		list.printList();
		list.removeDuplicates();
		list.printList();
	}

}
