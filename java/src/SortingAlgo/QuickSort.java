/**
 * 
 */
package SortingAlgo;

import java.util.Arrays;

/**
 * @author yogeshverma
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,4,99,82,23,31};
		quickSort(a);
		
		System.out.println(Arrays.toString(a));

	}
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	public static void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		
		quickSort(array, left, index - 1);
		quickSort(array, index, right);
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			while(array[left] < pivot) {
				left++;
			}
			while(array[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	public static void swap(int[] array, int left, int right) {
		int temp = array[right];
		array[right] = array[left];
		array[left] = temp;
	}

}
