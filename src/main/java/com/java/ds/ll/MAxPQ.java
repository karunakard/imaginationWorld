package com.java.ds.ll;

public class MAxPQ {
	
	private Integer[] heap;
	private int n;
	
	public MAxPQ(int capacity) {
		heap=new Integer[capacity+1];
		n=0;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public int size() {
		return n;
	}
	
	public void Insert(int data) {
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=data;
		swim(n);
		
	}
	
	public void swim(int k) {
		while(k>1 && heap[k/2]<heap[k]) {
			int temp=heap[k];
			heap[k]=heap[k/2];
			heap[k/2]=temp;
			k=k/2;
		}
	}
	
	private void resize(int capacity) {
		Integer[] temp=new Integer[capacity];
		for(int i=0;i<temp.length;i++) {
			temp[i]=heap[i];
		}
		heap=temp;
		
	}
	
	private void printHeap() {
		for(int i=1;i<heap.length;i++) {
			System.out.print(heap[i]+ " ");
		}
	}

	public static void main(String[] args) {
		
		MAxPQ pq=new MAxPQ(3);
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		pq.Insert(4);
		pq.Insert(5);
		pq.Insert(2);
		pq.Insert(6);
		pq.Insert(1);
		pq.Insert(3);
		System.out.println(pq.size());
		pq.printHeap();
	}

}
