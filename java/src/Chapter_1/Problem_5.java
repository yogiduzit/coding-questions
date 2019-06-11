package Chapter_1;

public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean OneAway(String correct, String inc) {
		if (correct.length() != inc.length()) {
			if (!(Math.abs(correct.length() - inc.length()) > 1)) {
				return false;
			}
		} else {
			if (Math.abs(correct.length() - inc.length()) == 1) {
				for (int i = 0; i < correct.length(); i++) {
					int count = 0;
					if (inc.contains(correct.substring(i, i + 1))) {
						count++;
					}
				}
			}
		}
		return true;
	}
}
