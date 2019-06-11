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
		int combs = (numbers.length * (numbers.length - 1)) / 2;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i; j < numbers.length; j++) {
			   num += getUniqueNumbers(numbers[i], numbers[j]);
			   
			}
		 }
		
		 num += getUniqueNumbers(numbers[numbers.length - 1], numbers[0]);
		 System.out.println(num);
	    return num * 100 / (45 * 10 * 6);
    }
	public static int compareCommonNumbers(String a, String b) {
		int count = 0;
		
		return count;
	}
	private static double getUniqueNumbers(String a, String b) {
		double count = 0;
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
