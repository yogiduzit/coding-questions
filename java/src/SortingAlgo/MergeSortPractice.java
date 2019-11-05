/**
 * 
 */
package SortingAlgo;

import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class MergeSortPractice {
	
	/**
	 * Create two halves and then merge them
	 * [1,3,4,2,5,8,6,7]
	 * 
	 */
	public static void mergeSort(int[] a) {
		mergeSort(a, new int[a.length], 0, a.length - 1);
	}
	public static void mergeSort(int[] a,int[]temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {
			return;
		}
		int middle = (leftStart + rightEnd) / 2;
		
		mergeSort(a, temp, leftStart, middle);
		mergeSort(a, temp, middle + 1, rightEnd);
		mergeHalves(a, temp, leftStart, rightEnd);
	}
	public static void mergeHalves(int[]a, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		
		int left = leftStart;
		int right = rightStart;
		
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {
			if (a[left] > a[right]) {
				temp[index] = a[right];
				right++;
			} else {
				temp[index] = a[left];
				left++;
			}
			index++;
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,4,99,82,23,31};
		mergeSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
