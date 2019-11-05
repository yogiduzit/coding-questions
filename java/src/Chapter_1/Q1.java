/**
 * 
 */
package Chapter_1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author yogeshverma
 *
 */
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueSort("Yo"));
		System.out.println(isUniqueHash("Yogii"));
	}
	
	/* Time Complexity - nlogn */
	public static boolean isUniqueSort(String word) {
		
		/* Sort the array */
		String[] alphabets = word.split("");
		Arrays.sort(alphabets);

		/* Check for any duplicate pair */
		for (int i = 0; i < alphabets.length - 1; i++) {
			if (alphabets[i].equals(alphabets[i+1])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isUniqueHash(String word) {
		String[] alphabets = word.split("");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < alphabets.length; i++) {
			if (!map.containsKey(alphabets[i])) {
				map.put(alphabets[i], 0);
			} else {
				return false;
			}
		}
		return true;
		
		
		
	}

}
