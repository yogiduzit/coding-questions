/**
 * 
 */
package practice;

import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b', 'b'};
		System.out.println(compressChars(a));
		System.out.println(Arrays.toString(a));
	}
	
	public static int compressChars(char[] chars) { 
		if (chars.length == 0) {
			return -1;
		}
		
		int index = 0;
		for (int i = 0; i < chars.length; i++) {

			chars[index] = chars[i];
			index += 1;
			
			int j = i + 1;
			int numChar = 1;

			while(j <= chars.length - 1 && chars[j] == chars[i]) {
				chars[j] = ' ';
				numChar += 1;
				j++;
			}
			
			if (numChar > 1) {
				char[] number = Integer.toString(numChar, 10).toCharArray();
				for (int b = 0; b < number.length; b++) {
					chars[index] = number[b];
					index++;
				}
			}
			System.out.println(index + " " + j);
			if (j >= chars.length - 1) {
				return index;
			}
		}
		return 1;
	}

}
