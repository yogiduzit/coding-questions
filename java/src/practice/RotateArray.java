/**
 * 
 */
package practice;

import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		rotate(a, 2);
		System.out.println(Arrays.toString(a));
	}
	
	/* [1,2,3,4,5] -> [] */
    public static void rotate(int[] nums, int k) {
    	if (k % nums.length == 0) {
    		return;
    	}
    	if (k > nums.length) {
    		k = k % nums.length;
    	}
    	for (int i = nums.length - k; i < nums.length; i++) {
    		int value = nums[i];
    		int index = i;
    		for(int j = 1; j <= nums.length - k; j++) {
    			int temp = nums[index - j];
    			nums[index - j + 1] = temp;
    			nums[index - j] = value;
    		}
    	}
    }
	

}
