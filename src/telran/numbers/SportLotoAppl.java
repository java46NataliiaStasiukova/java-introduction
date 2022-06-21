package telran.numbers;
/**
 * 
 * @author nataliiastasiukova
 *application should print out 7 random numbers in the range [1-49]
 */
public class SportLotoAppl {

	public static void main(String[] args) {
		int min = 1, max = 49;
		int res[] = new int[7];
		for(int i = 0; i < res.length; i++) {
			int temp = 0;
			int contains = 0;
		while(contains <= 0) {
			temp = getRandomNumber(min, max);
			contains = searchNumber(res, temp);
			}			
			res[i] = temp;
			System.out.print(res[i] + " ");
		}
	}
	private static int searchNumber(int[] ar, int temp) {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == temp) {
				return -1;
			}
		}
		return 1;
	}
	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}
