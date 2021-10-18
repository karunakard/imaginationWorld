package com.array.practise;

public class MaxHeap {
	private int[] heap;
	private int size;
	private int maxSize;
	
	public MaxHeap(int maxSize) {
		
		this.maxSize=maxSize;
		this.size=0;
		heap=new int[this.maxSize];
		
	}
	
	private int parent(int pos) {
		return (pos-1)/2;
	}
	
	
	private int leftChild(int pos) {
		return 2*pos;
	}
	
	public int rightChild(int pos) {
	
		return 2*pos+1;
	}
	
	private void swap(int fpos,int spos) {
		int temp;
		temp=heap[fpos];
		heap[fpos]=heap[spos];
		heap[spos]=temp;
	}
	
	public boolean isLeaf(int pos) {
		if(pos>(size/2) && pos<=size) {
			return true;
		}else {
			return false;
		}
	}
	
	public void print()
    {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(
                " PARENT : " + heap[i]
                + " LEFT CHILD : " + heap[2 * i + 1]
                + " RIGHT CHILD :" + heap[2 * i + 2]);
            System.out.println();
        }
    }
	
	public int extractMax() {
		int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
	}
	
	private void maxHeapify(int pos) {
		if(isLeaf(pos)) {
			return;
		}
		
		if(heap[pos]<heap[leftChild(pos)] || heap[pos]<heap[rightChild(pos)]) {
			
			if(heap[leftChild(pos)]>heap[rightChild(pos)]) {
				swap(leftChild(pos),pos);
				maxHeapify(leftChild(pos));
			}
			else {
				swap(rightChild(pos),pos);
				maxHeapify(rightChild(pos));
			}
			
		}
		
		
	}
	
	public void insert(int element) {
		heap[size]=element;
		int current=size;
		while(heap[current]>heap[parent(current)]) {
			swap(current,parent(current));
			current=parent(current);
		}
		size++;
	}
	
	
	public static void main(String[] args) {
		MaxHeap maxheap=new MaxHeap(15);
		int[] arr= {7,10,4,3,20,15};
		for(int i=0;i<arr.length;i++) {
			maxheap.insert(arr[i]);
		}
		System.out.println(maxheap.heap[4]);
		maxheap.print();
		
		
	}

}
