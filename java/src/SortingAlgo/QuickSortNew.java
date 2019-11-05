/**
 * 
 */
package SortingAlgo;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author yogeshverma
 *
 */
public class QuickSortNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,3,5,6,2,7,9,8};
		QuickSortNew qs = new QuickSortNew(); 
		qs.quicksort(a);
		System.out.println(Arrays.toString(a));
	}
	public void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}
	
	public void quicksort(int[] array, int low, int high) {
		if (low <= high) {
			int pi = partition(array, low, high);
			
			quicksort(array, low, pi - 1);
			quicksort(array, pi + 1, high);
		}
	}
	
	public int partition(int[] array, int low, int high) {
		int pivot = array[high];
		
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i , j);
			}
		}
		swap(array, high, i + 1);
		return i + 1;
	}
	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
