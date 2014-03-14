package ca.jianli;

/**
 * Reverse a phrase by reversing the words, but not the words themselves.
 * 
 * example:
 * 
 * "hello world" -> "world hello"
 * 
 * "i am reversed" -> "reversed am i" *
 * 
 * @author Jian Li
 * 
 */
public class ReverseWords {
	public static String solution1(String s) {
		StringBuilder sb = new StringBuilder();

		int i, j;
		i = j = s.length() - 1;
		while (j >= 0) {
			// append a "word"
			while (j >= 0 && s.charAt(j) != ' ') {
				j--;
			}
			sb.append(s.substring(j + 1, i + 1));
			// append space in between
			while (j >= 0 && s.charAt(j) == ' ') {
				sb.append(' ');
				j--;
			}
			i = j;
		}
		return sb.toString();
	}
}
