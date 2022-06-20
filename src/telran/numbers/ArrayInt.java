package telran.numbers;

public class ArrayInt {
	/**
	 * 
	 * @param ar
	 * @param number
	 * @return new array with added number
	 */
	public static int[] addNumber(int ar[], int number) {
		int res[] = new int[ar.length + 1];//creates array as the reference to ar.length + 1 primitives
		//copying from ar to res:	
		for(int i = 0; i < ar.length; i++) {
			res[i] = ar[i];
		}
		res[res.length - 1] = number;
		return res;
		//TODO HW #3
		//rewrite this method using class Arrays. method copyOf
	}
	/**
	 * 
	 * @param ar
	 * @param index
	 * @param number
	 * @return new array(reference) containing number value at the given index
	 */
	public static int[] insertNumber(int ar[], int index, int number) {
		//TODO
		//solution based on the method arraycopy of the class System (System.arraycopy)
		return null;
	}
	/**
	 * 
	 * @param ar
	 * @param index
	 * @return new array with removed number at the given index
	 */
	public static int[] removeNumber(int ar[], int index) {
		//TODO
		//solution based on the method arraycopy of the class System (System.arraycopy)
		return null;
	}
	/**
	 * 
	 * @param ar
	 * @param number
	 * @return if the given number exists in the given array then returns the index of first occurrence,
	 * otherwise return -1.
	 */
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
