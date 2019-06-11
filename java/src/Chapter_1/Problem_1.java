package Chapter_1;

/**
 * 
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * @author yogeshverma
 * @version 1;
 */
public class Problem_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b = "A man a plan a canal  Panama";
		
		
		
	}
	public static boolean IsUniqueChars(String b) {
		for (int i = 0; i < b.length(); i++) { 
			if(b.indexOf(b.charAt(i)) != i) {
				/* 
				 * Checks if the current index of the character is the same as the
				 * first occurence.
				 */
				
				return false;
			}
		}
		return true;
	}
}