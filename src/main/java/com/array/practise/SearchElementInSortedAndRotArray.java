package com.array.practise;

public class SearchElementInSortedAndRotArray {
	
	
	public int rotateArrayandSearch(int[] arr,int d,int valuetoFind ) {
		int n=arr.length;
		for(int i=0;i<d;i++) {
			rotate(arr);
		}
		int pivot = findPivot(arr,0,n-1);
		if(pivot==-1) {
			int valuef = binarySearch(arr, 0, n-1, valuetoFind);
			//System.out.println(valuef);
		}
		
		if(arr[pivot]==valuetoFind) {
			return arr[pivot];
		}else if(valuetoFind<=arr[0]) {
			return binarySearch(arr, pivot+1,n-1, valuetoFind);
		}else {
			return binarySearch(arr, 0, pivot-1, valuetoFind);
		}
		
		
	
	}
	
	public void rotate(int[] arr) {
		int j=0;
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			j=i+1;
			arr[i]=arr[j];
		}
		arr[j]=temp;
		
	}
	
	
	
	public int findPivot(int[] arr,int low,int high) {
		if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
		
	
	public int binarySearch(int[] arr,int low,int high,int value) {
		
		if(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==value) {
				return arr[mid];
			}else if(value>arr[mid]) {
				return binarySearch(arr,mid+1,high,value);
			}else {
				return binarySearch(arr, low,mid-1 , value);
			}
		}
		
		return -1;
	}
	
	static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
     
            return search(arr, mid + 1, h, key);
        }
 
        
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
 
        return search(arr, l, mid - 1, key);
    }
	
	
	
	public static void main(String[] args) {
		SearchElementInSortedAndRotArray srch=new SearchElementInSortedAndRotArray();
		int[] arr={ 1, 2, 3, 4, 5};
		int valuetoSeach=4;
		int findvalye = srch.rotateArrayandSearch(arr, 2,valuetoSeach);
		if(arr[findvalye]==valuetoSeach) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		for(int i=0;i<arr.length;i++) {
			//System.out.println(rotateArray[i]);
		}
		
		
		
	}

}
