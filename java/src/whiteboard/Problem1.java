/**
 * 
 */
package whiteboard;
import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class Problem1 {


    public static String nearestPalindromic(String n) {
        String palindrome = n;
        for (int i = 0; i < n.length(); i++) {

        	char a = palindrome.charAt(palindrome.length() - i - 1);
        	char b = palindrome.charAt(i);
            palindrome = palindrome.replace(a, b);
            if (palindrome == n) {
                return "0";
            }
        }
        return palindrome;
    }
     
	/**
	 * Sort an array with even elements in the front 
	 * and odd elements in the end.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nearestPalindromic("123"));
	}

}
