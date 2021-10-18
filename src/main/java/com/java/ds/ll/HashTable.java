package com.java.ds.ll;

public class HashTable {
	private HashNode buckets[];
	private int noOfBuckets;
	private int size;
	
	public HashTable(int capacity) {
		this.buckets=new HashNode[capacity];
		this.noOfBuckets=capacity;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key,String value) {
			this.key=key;
			this.value=value;
		}
		
		
	}
	
	public int getIndex(Integer key) {
		return key%noOfBuckets;
	}
	
	public void put(Integer key,String value) {
		if(key==null|| value==null) {
			throw new IllegalArgumentException();
		}
		int bucketindex=getIndex(key);
		HashNode head = buckets[bucketindex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=buckets[bucketindex];
		HashNode node=new HashNode(key, value);
		node.next=head;
		buckets[bucketindex]=node;
	
		
	}
	
	public String get(Integer key) {
		if(key==null) {
			throw new IllegalArgumentException();
		}
		int bucektIndex=getIndex(key);
		HashNode head=buckets[bucektIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public String remove(Integer key) {
		if(key==null) {
			throw new IllegalArgumentException();
		}
		int bucketIndex = getIndex(key);
		HashNode head=buckets[bucketIndex];
		HashNode previous=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			previous=head;
			head=head.next;
		}
		
		if(head==null) {
			return null;
		}
		size--;
		if(previous!=null) {
			previous.next=head.next;
		}else {
			buckets[bucketIndex]=head.next;
		}
		
		return head.value;
	}
	
	
	
	public static void main(String[] args) {
		HashTable table=new HashTable(10);
		table.put(35, "karan");
		table.put(11, "aman");
		table.put(21, "sanam");
		table.put(31, "rajiv");
		table.put(12, "vamshi");
		System.out.println(table.size);
		System.out.println(table.get(11));
		System.out.println(table.get(21));
		System.out.println(table.size()+"  "+table.remove(31)+"  "+table.size());
		
	}

}
