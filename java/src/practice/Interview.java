/**
 * 
 */
package practice;

import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class Interview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc1zyx21pqr34";
		System.out.println(addNumbers(reverseInteger(1423525)));
	}
	/**
	 * Create a function that gives the length of a string
	 */
	public static int stringLength(String string) {
		int i = 0;
		
		
		try {
			while(true) {
				char check = string.charAt(i);
				i += 1;
			}
		} catch (StringIndexOutOfBoundsException ex) {
			return i;
		}

	}
	
	/* Reverse the order of word "I love Vancouver" => "Vancouver love I"
	 */
	public static String reverseSentence(String s) {
		String[] words = s.split(" ");
		String newSentence = new String();
		
		for (int i = 1; i <= words.length; i++) {
			newSentence += (words[words.length - i] + " ");
		}
		
		return newSentence;
		
	}
	/* String is an input and it can contain numbers. Return sum of all the numbers 
	 * ""*/
	/* for loop, check if this number is isolated and add them 
	 * 		Integer.parseInt();
	 * */

//	public static String[] addNumbers(String s) {
//		String[] a = new String[s.length()];
//		
//		String number = new String();
//		boolean pusher = false;
//		int counter = 0;
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			String isNum = Character.toString(s.charAt(i));
//			
//			if () {
//				number += isNum;
//				pusher = true;
//			} else {
//				if (pusher) {
//					counter += 1;
//					a[counter] = number;
//					pusher = false;
//				}
//			}
//		}
//		return a;
//	}
	
	public static int add(String[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			count += Integer.parseInt(numbers[i]);
		}
		return count;
	}
	
	/* Reverse an integer number 12345 */
	public static int[] reverseInteger(int number) {
		int count = counter(number);
		
		
		int[] digits = new int[count];
		
		for (int i = count - 1; i >= 0; i--) {
			int digit = (int) (number / Math.pow(10, i));
			number = (int) (number % Math.pow(10, i));
			
			digits[count - i - 1] = digit;
		}
		return digits;
		
	}
	public static int addNumbers(int[] a) {
		int sum = 0;
		
		for (int num = 0; num < a.length; num++) {
			sum += (a[num] * Math.pow(10, num));
		}
		return sum;
	}
	public static int counter(int number) {
		int counter = 0;
		while(number > 1) {
			number = number / 10;
			counter += 1;
		}
		return counter + 1;
	}
	
	

}