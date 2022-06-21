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

}
