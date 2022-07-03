package telran.text;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Strings {
/**
 * 
 * @param str1 ascii string with no repeated symbols
 * @param str2 ascii string with no repeated symbols
 * @return array with two numbers
 *    first - number of the symbols of the str2 that exist in str1 at the same indexes
 *    second - number of the symbols of the str2 that exist in str1 at different indexes
 */
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int minLength = str1.length() < str2.length() ? str1.length() : str2.length();
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < minLength; i++) {
			if(str1.charAt(i) == str2.charAt(i)) count1++;
			if(str1.indexOf(str2.charAt(i)) >= 0 && str1.indexOf(str2.charAt(i)) != i) count2++;
		}	
		int res[] = {count1, count2};
	//TODO
		//Two implementation hints
		//   first: additional helper array such that array['a'] 
		//          is an index of the symbol 'a' in str1 or -1
		//          example, str1 - "ctab" then array['a'] = 2;
		// ************************************************
		//   second: implementation based on the method indexOf
	return res;
}
	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if :
	 *     (1) str2 has the same as str1 length
	 *     (2) str2 comprises of all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		for(int i = 0; i < str1.length(); i++) {
			if(str2.indexOf(str1.charAt(i)) < 0) return false;
		}
		//TODO
		// additional helper array such that array['a'] is the number of 'a' occurrences in str1
		//str1 = "hello", array['l'] = 2; array['w'] = 0;
		return true;
		
	}
}