package Chapter_1;

public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(OneAway("bple", "pale"));

	}
	public static boolean OneAway(String correct, String inc) {
		if (correct.length() != inc.length()) {
			
			if (!(Math.abs(correct.length() - inc.length()) > 1)) {
				return false;
			} else if (Math.abs(correct.length() - inc.length()) == 1) {
				int count = 0;
				for (int i = 0; i < correct.length(); i++) {
					if (!inc.contains(correct.substring(i, i + 1))) {
						count++;
						}
					}
				System.out.println(count);
				if (count > 1) {
				return false;
				}
				
			} return true;
			
		} else {
	
			int count = 0;
			for (int i = 0; i < correct.length(); i++) {
				if (inc.contains(correct.substring(i, i + 1))) {
					if (inc.indexOf(correct.charAt(i), i) != correct.indexOf(correct.charAt(i), i)) {
						count += 1;
					}
					
					}
				}
			System.out.println(count);
			if (count > 1) {
			return false;
			}
			return true;
		}
	}
}

