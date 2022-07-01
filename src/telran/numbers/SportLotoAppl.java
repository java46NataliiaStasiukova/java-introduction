package telran.numbers;
/*
 *application should print out 7 random numbers in the range [1-49]
 */
public class SportLotoAppl {

	public static void main(String[] args) {
		int min = 1, max = 49;
		int res[] = new int[7];
		for(int i = 0; i < res.length; i++) {
			int temp = 0;
			int contains = 1;
		while(contains >= 0) {
			temp = getRandomNumber(min, max);
			contains = ArrayInt.indexOf(res, temp);
			}			
			res[i] = temp;
			System.out.print(res[i] + " ");
		}
	}
	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}
