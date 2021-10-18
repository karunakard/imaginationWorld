package com.array.practise;

public class MinHeap {
	private int[] heap;
	private int size;
	private int maxSize;
	
	private static final int FRONT=1;
	
	/*
	 * public MinHeap(int maxSize) { this.maxSize=maxSize; this.size=0; heap=new
	 * int[maxSize+1]; heap[0]=Integer.MIN_VALUE; }
	 */
	
	//changes has been done
	
	
	
	private int parent(int pos) {
		return pos/2;
	}
	
	private int leftChild(int pos) {
		return 2*pos;
	}
	
	private int rightChild(int pos) {
		return 2*pos+1;
	}
	
	public boolean isleaf(int pos) {
		if(pos<pos/2 && pos<=size) {
			return true;
		}
		return false;
	}
	
	private void swap(int fpos,int spos) {
		int temp=heap[fpos];
		heap[fpos]=heap[spos];
		heap[spos]=temp;
	}
	
	private void minHeapify(int pos) {
		if(!isleaf(pos)) {
			if(heap[pos]>heap[leftChild(pos)]|| heap[pos]>heap[rightChild(pos)]) {
				if(heap[leftChild(pos)]<heap[rightChild(pos)]) {
					swap(pos,leftChild(pos));
					minHeapify(leftChild(pos));
				}else {
					swap(pos,rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
		
		
	}
	
	public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
 
            // Printing the parent and both childrens
            System.out.print(
                " PARENT : " + heap[i]
                + " LEFT CHILD : " + heap[2 * i]
                + " RIGHT CHILD :" + heap[2 * i + 1]);
 
            // By here new line is required
            System.out.println();
        }
    }
	
	private int remove() {
		int popped=heap[FRONT];
		heap[FRONT]=heap[size--];
		minHeapify(FRONT);
		return popped;
	}
	
	
	
	private void insert(int element) {
		if(size>=maxSize) {
			return;
		}
		heap[++size]=element;
		int current=size;;
		
		while(heap[current]<heap[parent(current)]) {
			swap(current,parent(current));
			current=parent(current);
		}
		size++;
		
	}
	
	public static void main(String[] args) {
		MinHeap minHeap=new MinHeap(15);
		int[] arr= {7,10,4,3,20,15};
		for(int i=0;i<arr.length;i++) {
			minHeap.insert(arr[i]);
		}
		System.out.println(minHeap.heap[3]);
	        
	        minHeap.print();
	        System.out.println(minHeap.remove() );
		
	}

}
