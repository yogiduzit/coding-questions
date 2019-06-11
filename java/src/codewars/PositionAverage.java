/**
 * 
 */
package codewars;

/**
 * @author yogeshverma
 *
 */
public class PositionAverage {
	public static double posAverage(String s) {
		double num = 0;
		 String[] numbers = s.split(", ");
		for (int i = 0; i < numbers.length - 1; i++) {
			 num += getUniqueNumbers(numbers[i], numbers[i + 1]);
		 }
		 num += getUniqueNumbers(numbers[0], numbers[numbers.length - 1]);
	    return 200 * num / (numbers.length * numbers.length - 1);
    }
	public static int compareCommonNumbers(String a, String b) {
		int count = 0;
		
		return count;
	}
	private static int getUniqueNumbers(String a, String b) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			char z = a.charAt(i);
			int indexOfb = b.trim().indexOf(z, i);
			int indexOfa = a.trim().indexOf(z, i);
			if (indexOfa == indexOfb && indexOfa != -1 && indexOfb != -1) {
				count += 1;
			}
		}
		return count;
		
	}
}
