/**
 * 
 */
package Chapter_1;

import java.util.HashMap;

/**
 * @author yogeshverma
 *
 */
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checker("aaaa", "aabc"));
		// TODO Auto-generated method stub

	}
	public static HashMap<Character, Integer> createStringHash(final String s) {
		HashMap<Character, Integer> stringHash = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (stringHash.containsKey(s.charAt(i))) {
				int count = stringHash.get(s.charAt(i));
				
				stringHash.put(s.charAt(i), count+=1);
			} else {
				stringHash.put(s.charAt(i), 1);
			}
		}
		System.out.println(stringHash.toString());
		
		return stringHash;
	}
	
	public static boolean checker(final String original, final String perm) {
		if (original.length() != perm.length()) {
			return false;
		}
		
		return createStringHash(original).equals(createStringHash(perm));
	}
}

