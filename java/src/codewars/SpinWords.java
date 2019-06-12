package codewars;

public class SpinWords {
	public String spinWords(String sentence) {
		String[] messageArr = sentence.split(" ");
		String newSentence = "";
		for (String a: messageArr) {
			if (a.length() >= 5) {
				for (int i = a.length() - 1; i >= 0; i--) {
					newSentence += a.charAt(i);
				}
			} else {
				newSentence += a;
			}
			newSentence += " ";
		}
		newSentence = newSentence.trim();
		//TODO: Code stuff here
		System.out.println((newSentence));
		return newSentence;
	}
}
