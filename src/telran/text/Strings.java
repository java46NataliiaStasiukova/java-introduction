package telran.text;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static telran.text.RegularExpressions.*;
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
	public static String join(String[] array, String delimiter) {
		//String "+" operator based solution
		//return stringPluseSolution(array, delimiter);
		//String builder attend based solution
		return stringBuilderSolution(array, delimiter);
	}
	private static  String stringBuilderSolution(String[] array, String delimiter) {
		StringBuilder strBuilder = new StringBuilder(array[0]);
		for(int i = 1; i < array.length; i++) {
			strBuilder.append(delimiter).append(array[i]);
		}
		return strBuilder.toString();
	}
	private static String stringPluseSolution(String[] array, String delimiter) {
		String res = array[0]; //assumption: there is at least one string
		for(int i = 1; i < array.length; i++) {
			res += delimiter + array[i];
		}
		return res;
	}
	/**
	 * 
	 * @param name1 - first name
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO )
	 */
	static public String maches(String name1, String name2) {

		//TODO
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names
		return "match";
	}
	public static int compareByLetters(String[] names1, String[] names2, int index) {
		//if(names1[i][0] == names2[i][0] || names1[i + 1][0] == names2[i][0]) return 0;
		return -1;
	}
	/**
	 * sorts array of strings
	 * @param strNumbers - array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be grater than string containing "23" as the number 123 grater
	 * than the number 23.
	 */
	static public void sortStringsAsNumbers(String[] strNumbers) {
		//TODO
		//Algorithm complexity should be O[N]
		//Implementation hint: additional helper array such that ar[10] - count of occurrences
		//of number 10 in the given array
		//find out how to get number from a string and how to convert number to string
	}
	public static boolean isIPv4(String ipV4str) {
		
		return ipV4str.matches(ipV4Regex());
	}
	public static boolean isJavaVariable(String javaVariable) {
		
		return javaVariable.matches(javaVariableRegex());
	}
	public static boolean isArithmeticExpression(String expression) {
		if(!checkParentheses(expression)) {
			return false;
		}
		expression = removeSpacesAndParentheses(expression);
		return expression.matches(arithmeticExpression());
	}
	/**
	 * 
	 * @param expression
	 * returns string with no parentheses and no spaces
	 */
	private static String removeSpacesAndParentheses(String expression) {
		// TODO Auto-generated method stub
		return "";
	}
	/**
	 * 
	 * @param expression
	 * @return true if for each '(' there is ')'
	 * examples: (ab)(dg(g)) -> true
	 *           (ab))((cd)  -> false
	 */
	private static boolean checkParentheses(String expression) {
		// TODO Auto-generated method stub
		//Hint: count with ++ for '(' and -- ')'. If count < 0 then return false. 
		return false;
	}
}