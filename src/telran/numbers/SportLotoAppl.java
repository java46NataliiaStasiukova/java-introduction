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
			res[i] = getRandomNumber(min, max);
			System.out.print(res[i] + " ");
		}
//Option without using array:
//		int min = 1, max = 49, i = 7;
//		while(i > 0) {
//			System.out.print(getRandomNumber(min, max) + " ");
//			i--;
//		}
		
	}
	//helper method for getting one random number in the range [min - max]
	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}
