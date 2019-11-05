/**
 * 
 */
package practice;

/**
 * @author yogeshverma
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(5));
	}
	
//	public static int fibonacci(int n) {
//		int first = 1;
//		int second = 1;
//		
//		for (int i = 2; i < n; i++) {
//			int temp = second;
//			second = first + second;
//			first = temp;
//			
//		}
//		
//		return second;
//	}
	
	public static int fibonacci(int n) {
		
		if (n >= 2) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
		if (n == 1) {
			return 1;
		}

		return 0;
		
	}

}
