package com.array.practise;

public class MoveZerosToEnd {

	public int[] moveZerosToEnd(int[] arr) {
		int left = 0;
		int right = arr.length;
		int count = 0;
		while (left < right) {
			if (arr[left] != 0) {
				arr[count] = arr[left];
				left++;
				count++;
			} else {
				left++;
			}
		}

		for (int j = count; j < right; j++) {
			arr[j] = 0;
		}
		return arr;
	}

	public int[] moveZerosToEndInOneLoop(int[] arr) {
		int left = 0;
		int right = arr.length;
		int count = 0;
		while (left < right) {
			if (arr[left] != 0) {
				if (arr[count] == 0) {
					int temp = arr[left];
					arr[left] = arr[count];
					arr[count] = temp;
				}
				count++;

			}
			left++;
		}

		return arr;
	}
	
	public int[] doubleTheFirEleIfEqualsAndMoveZeroToEnd(int[] arr) {
		int left = 0;
		int right = arr.length;
		int count = 0;
		while (left < right) {
			if (arr[left] != 0) {
				if (arr[count] == 0) {
					int temp = arr[left];
					arr[left] = arr[count];
					arr[count] = temp;
				}
				count++;

			}
			left++;
		}
		
		

		return arr;
	}

	public static void main(String[] args) {
		MoveZerosToEnd end = new MoveZerosToEnd();
		int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int[] moveZerosToEnd = end.moveZerosToEnd(arr);

		for (int i = 0; i < moveZerosToEnd.length; i++) {
			System.out.println(moveZerosToEnd[i]);
		}

		/*
		 * int[] moveZerosToEndInOneLoop = end.moveZerosToEndInOneLoop(arr); for(int
		 * i=0;i<moveZerosToEndInOneLoop.length;i++) {
		 * System.out.println(moveZerosToEndInOneLoop[i]); }
		 */

	}

}
