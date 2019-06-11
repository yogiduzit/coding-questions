package Chapter_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean IsPalindromePermutation(String palindrome) {
		char[] cleanup = palindrome.toLowerCase().replaceAll("\\s", "").toCharArray();
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		
		Arrays.sort(cleanup);
		String cleaned = new String(cleanup);
		
		if (cleaned.length() % 2 == 0) {
			
			for (int i = 1; i < cleaned.length(); i += 2) {
				
				if (cleaned.charAt(i) != cleaned.charAt(i - 1)) {
					return false;
				}
			}
		} 
		else {
			for (int i = 0; i < cleanup.length; i++) {
				if (charCounts.containsKey(cleanup[i])) {
					charCounts.put(cleanup[i], charCounts.get(cleanup[i]) + 1);
				} else {
					charCounts.put(cleanup[i], 1);
				}
			}
			for (Map.Entry<Character, Integer> item: charCounts.entrySet()) {
				int count = 0;
				if (item.getValue() % 2 != 0) {
					// Checks if the count is odd or not.
					count += 1;
				}
				if (count > 1) {
					return false;
				}
			}
		}
		return true;
	}

}
