package Chapter_1;

public class Problem_3 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b = "A man a plan a canal  Panama";
		
		
		
	}
	public static String URLify(String a) {
		String[] strings = a.trim().split(" ");
		String newString = "";
		for (int i = 0; i < strings.length; i++) {
			if (i != strings.length - 1) {
				strings[i] += "%20";
			}
			newString += strings[i];
		}
		return newString;
	}

}
