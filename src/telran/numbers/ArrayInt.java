package telran.numbers;

import java.util.Arrays;

public class ArrayInt {

	public static int[] addNumber(int ar[], int number) {
		int res[] = Arrays.copyOf(ar, ar.length + 1);
		res[ar.length] = number;
		return res;		
	}

	public static int[] insertNumber(int ar[], int index, int number) {
		int res[] = new int[ar.length + 1];
		res[index] = number;
		System.arraycopy(ar, 0, res, 0, index);
		System.arraycopy(ar, index, res, index + 1, ar.length - index);
		return res;
	}

	public static int[] removeNumber(int ar[], int index) {
		int res[] = new int[ar.length - 1];
		System.arraycopy(ar, 0, res, 0, index);
		System.arraycopy(ar, index + 1, res, index, ar.length - index - 1);
		return res;
	}

	public static int indexOf(int ar[], int number) {
		int res = -1;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}
	
	//for worst case the number of iterations = N(N-1)/2
	public static void sort(int[] ar) {
		boolean isSorted = false;
		while(! isSorted) {
		for (int i = 0; i < ar.length; i++) {
			isSorted = moveMaxToEnd(ar, ar.length - i);
			}
		}	
	}
	
	private static boolean moveMaxToEnd(int[] ar, int length) {
		boolean isSorted = true;
		for(int i = 1; i < length; i++) {
			if (ar[i - 1] > ar[i]) {
				swap(ar, i);
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	private static void swap(int[] ar, int index) {
		int tmp = ar[index -1];
		ar[index -1] = ar[index];
		ar[index] = tmp;
		
	}
	/**
	 * 
	 * @param ar - sorted array
	 * @param number
	 * @return if the given number exists in the given array then returns the index of first occurrence,
	 *  otherwise returns negative value of (index + 1) where index is the one
	 *   at which the given number should have been
	 */
	public static int binaryIndexOf(int[] ar, int number) {
		//if index not found => return -(index + 1) 
			int left = 0;
			int right = ar.length - 1;
			int middle = ar.length / 2;
			int res = -1;
			while (left <= right ) {
				if (ar[middle] < number) {
					left = middle + 1; //looking for the number will be in right part of the array
				} else {
					if (ar[middle] == number) {
						res = middle;
					}
					right = middle - 1; //looking for the number will be in the left part of the array
				}
				middle = (left + right) / 2;
			}
			return res == -1 ? -(left + 1) : res;
		//return left > right ? res : middle;
		//TODO
		// fix the code for performing the method in accordance with the above definition (see the tests)
	}
}


